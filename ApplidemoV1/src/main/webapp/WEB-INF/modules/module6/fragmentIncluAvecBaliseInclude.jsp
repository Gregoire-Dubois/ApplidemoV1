<h3>Voici les informations lues dans le fichier fragmentIncludAvecBaliseInclude</h3>
<p>
	<% 
		String bonjour = "bonjour tout le monde";
	%>
	
	<%=bonjour%>
</p>

<%-- <%variableUtiliseeDansFragment --%> Erreur de Compilation--%>

<p>
	Lecture du param�tre "parametre"
	<%=request.getParameter("parametre") %>
	
</p>

<p>
	Lecture de l'attribut "attribut" : 
	<%=request.getAttribute("attribut") %>

</p>
