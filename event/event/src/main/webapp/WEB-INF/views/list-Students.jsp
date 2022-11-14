<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Students Directory</title>
</head>
<body>
	<div class="container">
		<h2 class="display-1 text-center" style="font-weight: 300;background-image: linear-gradient(to right, red, orange, yellow);   -webkit-background-clip: text;
  color: transparent">Students Directory</h2>
		<hr style = "border: 1px solid blue">

		<!-- Add a search form -->

		<form action="/StudentEvent/books/search" class="form-inline">
		<table class="table table-borderless">
		<tr>
		<td align="left">
			<!-- Add a button -->
			<a href="/StudentEvent/student/showFormForAdd"
				class="btn btn-primary btn-sm mb-3"> Add Student </a> 
		</td><td align="right"><a href="/StudentEvent/logout" 
					class="btn btn-primary btn-sm mb-3 mx-auto"> Logout </a> 
		</td>
		</tr>
		</table>
		</form>
		
		<table class="table table-bordered table-striped">
			<thead class="thead-light">
				<tr>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Course</th>
					<th>Country</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${Students}" var="tempStudent">
					<tr>
						<td><c:out value="${tempStudent.firstName}" /></td>
						<td><c:out value="${tempStudent.lastName}" /></td>
						<td><c:out value="${tempStudent.course}" /></td>
						<td><c:out value="${tempStudent.country}" /></td>
						<td>
							<!-- Add "update" button/link --> <a
							href="/StudentEvent/student/showFormForUpdate?studentId=${tempStudent.id}"
							class="btn btn-info btn-sm"> Update </a> <!-- Add "delete" button/link -->
							<a href="/StudentEvent/student/delete?studentId=${tempStudent.id}"
							class="btn btn-danger btn-sm"
							onclick="if (!(confirm('Are you sure you want to delete this Student?'))) return false">
								Delete </a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>