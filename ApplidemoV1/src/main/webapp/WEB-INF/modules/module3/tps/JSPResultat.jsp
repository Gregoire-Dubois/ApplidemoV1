<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../../../css/styleChifumi.css" rel="stylesheet">

<title>Résultat</title>
</head>
<body>
	<h1>Résultat du jeu</h1>
	
	<%
	
	String vainqueur = (String) request.getAttribute("vainqueur");
	
	String attaqueJoueur = (String) request.getAttribute("attaqueBot");
	
	String attaqueBot = (String) request.getAttribute("attaqueJoueur");
	
	%>
	<p> Le vainqueur est : <%=vainqueur %> 
	
	<p> Le bot attaque avec : <%=attaqueBot %> 
		
	<p> Le joueur attaque avec : <%=attaqueJoueur %> 
	
	<br>

	
	<a href="http://localhost:8080/ApplidemoV1/ServletDelegantAffichageTentativeChiffumi">Rejouer</a>
		
</body>
</html>