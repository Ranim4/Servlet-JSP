<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
	integrity="sha512-Fo3rlrZj/k7ujTnHg4CGR2D7kSs0v4LLanw2qksYuRlEzO+tcaEPQogQ0KaoGN26/zrn20ImR1DfuLWnOo7aBA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
</head>
<body>
	<div class="container">
		<div class="col-12">
			<h1 class="mt-3">Voting website</h1>
			<br> <br>
			<h3>SIGN IN</h3>
			<br>
			<div class="mb-3">
				<p style="color: red">${model.message}</p>
				<form action="LoginServlet" method="post">
				
				<h4 class="mt-3">Login:</h4>
					<input type="text" name="login" class="form-control" value="${model.login}"
						placeholder ="Insert your login" /> 
						
						<h4 class="mt-3">Password:</h4>
						<input type="password"
						name="password" class="form-control" value="${model.password}"
						placeholder="Insert your passowrd" /> 
						
						<button type="submit" name="valider" class="btn btn-primary mt-4">Sign in</button>
						<!-- <input type="submit" class ="mt-4" value="Sign in" name="valider" /> -->
				</form>
				</div>
				</div>
				</div>
</body>
</html>