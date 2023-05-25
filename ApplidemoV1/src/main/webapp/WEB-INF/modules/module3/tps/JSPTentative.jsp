<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../../../css/styleChifumi.css" rel="stylesheet">

<title>Chifumi</title>
</head>
<body>

	<h1>Tentative</h1>
	

	<form action="ServletAffichageResultatChifumi" method="post">
		<p>Selectionnez votre jeu</p>
		
		<input type="radio" id="pierre" name ="choixUnique" value="0">
		<label for="pierre">Pierre</label>
	
		<input type="radio" id="feuille" name="choixUnique" value="1">
		<label for="pierre">Feuille</label>
		
		<input type="radio" id="ciseaux" name="choixUnique" value="2">
		<label for="ciseaux">Ciseaux</label>
		
		<br>
		
		<input type="submit" value="submit">
	
	</form>

</body>
</html>