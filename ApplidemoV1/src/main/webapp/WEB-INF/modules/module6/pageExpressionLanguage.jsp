<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page qui affiche une voiture</title>
</head>
<body>

	<h1>Cette page affiche une voiture avec l'exression language si elle a été crée.</h1>
	
	<a href="">Raffraichir la page</a>
	
	
	
	<ul>
		<li>
			Marque : ${requestScope['voiture'].marque}
		</li>
		<li>
			Modèle : ${requestScope.Voiture.modele}
		</li>
		<li>
			Kilométrage : ${voiture.immatriculation}
		</li>
	
		<li>
			Immatriculation : ${voiture.kilometrage}
		</li>
	
	</ul>
	
	<a href="demonstrations/demonstration3.html">Retour</a>

</body>
</html>