<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>

<body>

	
	<a href="<%=request.getContextPath()%>/ServletAjoutRepas"><input type="button" value="Ajouter un nouveau repas"/></a>

	<a href="<%=request.getContextPath()%>/ServletHistorique"><input type="button" value="Visualiser les repas"></a>


</body>
</html>