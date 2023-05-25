<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page qui affiche une voiture</title>
</head>
<body>

	<h1>Cette page affiche une voiture avec les balises JSP si elle a été crée.</h1>
	
	<a href="">Raffraichir la page</a>
	
	<jsp:useBean id="voiture" 
				scope="request"
				class="fr.eni.applidemo.applidemov1.module6.bo.Voiture"
	></jsp:useBean>
	
	<ul>
		<li>
			Marque : <jsp:getProperty property="marque" name="voiture"/>
		</li>
		<li>
			Modèle : : <jsp:getProperty property="modele" name="voiture"/>
		
		</li>
		<li>
			Kilométrage : <jsp:getProperty property="kilometrage" name="voiture"/>
		</li>
	
		<li>
			Immatriculation : <jsp:getProperty property="immatriculation" name="voiture"/>
		</li>
	
	</ul>
	
	<a href="demonstrations/demonstration2.html">Retour</a>

</body>
</html>