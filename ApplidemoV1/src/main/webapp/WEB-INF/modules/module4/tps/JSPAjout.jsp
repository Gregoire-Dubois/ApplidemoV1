<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page d'ajout</title>
</head>
<body>

	<h1>Ajouter un repas</h1>


	<form action="" method="post">
	
		<input type="date"  id="day" name="date" value="2023-01-01" min="2000-01-01" required>
		<br>
		<input type="time" id="hour" name="time" required>
		<br>		
		<textarea rows="5" cols="33" id="aliments" name="aliments">
		Entrez les aliments que vous avez mangé.		
		</textarea>
		<br>
		
		<input type="submit" value="submit"> 

	</form>

</body>
</html>