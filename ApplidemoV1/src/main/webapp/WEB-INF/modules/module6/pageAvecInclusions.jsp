<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cette page est composée d'éléments inclus</title>
</head>
<body>

	<%@ include file="entete.html" %>
	
	<%
	
	int variableUtiliseeDansFragment=123;
	%>
	<%@
		include file="fragmentIncluAvecDirectInclude.jspf"
	 %>
	 
	 <%
	 	request.setAttribute("attribut", variableUtiliseeDansFragment);
	 
	 %>
	 
	
	<%@ include file="piedDePage.html" %>
	
	<jsp:include page="/WEB-INF/modules/module6/fragmentIncluAvecBaliseInclude.jsp">
	
		<jsp:param value="<%=variableUtiliseeDansFragment %>" name="parametre"/>
	</jsp:include>
	

</body>
</html>