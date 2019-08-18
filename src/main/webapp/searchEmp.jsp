<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<div class="card">
		<div class="card-body">
			<div class="container">
				<form action="searchEmp" modelAttribute="employee" method="post">

					<div class="form-group">
						<label>ID: </label> <input type="text" name="id"
							class="form-control" />
					</div>

					<button type="submit" class="btn btn-primary">Search</button>

				</form>
			</div>
		</div>
	</div>
</body>
</html>