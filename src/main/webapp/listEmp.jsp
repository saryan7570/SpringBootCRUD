<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>

	yo

	<TABLE>
		<c:forEach items="${employeeList}" var="person">
			<tr>
				<td><c:out value="${person}" /></td>
			</tr>
		</c:forEach>
	</TABLE>


</body>
</html>