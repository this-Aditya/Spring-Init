<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<head><title>new todo</title></head>
<body>
<div class="container">
<h1 align="center">Hi ${naam}, Add new Todo...</h1>
<hr>
<form:form method = "post" modelAttribute = "newTodo">
Description: <form:input type="text" path="taskDescription" required="required" />
<form:errors path = "taskDescription" cssClass = "text-warning"/>
<form:input type = "hidden" path = "id" />
<form:input type = "hidden" path = "done" />
<input type = "submit" class = "btn btn-success" />
</form:form>
</div>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>