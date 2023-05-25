package fr.eni.applidemo.applidemov1.module7;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class FiltreRessourcesInterdites
 */
@WebFilter(urlPatterns = "/modules/module7/*", dispatcherTypes = {
																	DispatcherType.REQUEST, 
																	DispatcherType.INCLUDE,
																	DispatcherType.FORWARD,
																	DispatcherType.ERROR
																	}
)
public class FiltreRessourcesInterdites extends HttpFilter implements Filter {
    

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		if(!httpServletRequest.getServletPath().toLowerCase().contains("interdit")) {
			// laisse passer la requete vers la ressource qui est autorisée
			chain.doFilter(httpServletRequest, response);
			
		}else {
			// renvoie une réponse 403
			HttpServletResponse httpResponse = (HttpServletResponse) response; 
			httpResponse.sendError(HttpServletResponse.SC_FORBIDDEN);
		}
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
