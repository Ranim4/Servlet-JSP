<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Right to vote</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
	integrity="sha512-Fo3rlrZj/k7ujTnHg4CGR2D7kSs0v4LLanw2qksYuRlEzO+tcaEPQogQ0KaoGN26/zrn20ImR1DfuLWnOo7aBA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
</head>
</head>
<body>
	<div class="container">
		<div class="col-12">
			<h1 class="mt-3">Voting website</h1>
			<br> <br>
			<h3>Right to vote</h3>
			<br>
			<div class="mb-3">
				<form action="VotantServlet" method="POST">
					<input type="text" class="form-control" name="nom" placeholder ="Last name" value="${model.current.nom}">
					<input type="text" class="form-control mt-3 mb-4" name="prenom" placeholder ="First name" value="${model.current.prenom}">
					
					<input class="btn btn-ligth" type="date" name="ddn"> 
					<br>
					<button type="submit" name="envoie" class="btn btn-primary mt-4">GO</button>
					<!-- <input type="submit" name="envoie" value="go"> -->
				</form>
				</div>
				</div>
				<a href="/voteMVCAvecLogin1/LogoutServlet">Sign out</a>
				<br>
				<h2>${model.reponse}</h2>
				<h2>${model.liste}</h2>
				</div>
				
				
</body>
</html>