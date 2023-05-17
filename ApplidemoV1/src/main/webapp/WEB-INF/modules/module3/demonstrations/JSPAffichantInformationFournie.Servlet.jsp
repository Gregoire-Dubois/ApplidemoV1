<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP qui affiche les informations fournies par la Servlet</title>
</head>
<body>

<%

	String uneVariable = (String)request.getAttribute("uneCle");
%>

L'information de la Servelet est <%=uneVariable %>

	<a href="<%=request.getContextPath()%>/modules/module3/demonstration/demonstration6.html">Retour</a>


</body>
</html>