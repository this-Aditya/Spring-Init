<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  	<head>
  		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
  		<title>List Todos Page</title>
  	</head>
<body>
<div class="container">
<h1 align="center">Hi ${naam}!!</h1>
<hr>
<h2>TODOs: </h2>
<hr>
<table class="table">
<thead>
<tr>
<th>Id</th>
<th>Username</th>
<th>Task</th>
<th>TargetDate</th>
<th>IsCompleted</th>
</tr>
</thead>
<tbody>
<c:forEach items = "${todos}" var = "todo">
<tr>
<td>${todo.id}</td>
<td>${todo.username}</td>
<td>${todo.taskDescription}</td>
<td>${todo.targetDate}</td>
<td>${todo.done}</td>
<td><a href = "delete-todo?id=${todo.id}" class = "btn btn-warning">Delete</a></td>
<td><a href = "update-todo?id=${todo.id}" class = "btn btn-success">Update</a></td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="add-todo" class = "btn btn-success">Add Todo</a>
</div>
 <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
 <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>