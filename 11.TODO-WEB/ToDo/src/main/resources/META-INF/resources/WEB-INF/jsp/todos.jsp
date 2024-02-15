<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<head><title>Welcome:TODO</title></head>
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
</tr>
</c:forEach>
</tbody>
</table>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</div>
</body>
</html>