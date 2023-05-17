<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
    isErrorPage = "false"
    errorPage="jspTraitantErreur.jsp"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Une page avec une erreur qui ne s'afficherea jamais (la page)</title>
</head>
<body>
	<%
	
	String maVariable = null;
	maVariable.length(); // va lever une erreur type null pointer exception
	
	%>
</body>
</html>

