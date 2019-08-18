<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<div class="card">
		<div class="card-body">
			<div class="container">
				<form action="addEmp" modelAttribute="employee" method="post">

					<div class="form-group">
						<label>Name: </label> <input type="text" name="name" class="form-control" />
					</div>

					<div class="form-group">
						<label>Mobile: </label> <input type="tel" name="mobile" class="form-control" />
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>

				</form>
			</div>
		</div>
	</div>
</body>
</html>