<%@ include file = "common/header.jspf"%>
<div class="container">
<h1 align="center">Hi ${naam}, Add new Todo...</h1>
<hr>
<form:form method = "post" modelAttribute = "updateTodo">
<fieldset class = "mb-3">
<form:label path = "username">UserName</form:label>
<form:input path = "username" type = "text" required = "required"/>
</fieldset>

<fieldset class = "mb-3">
<form:label path = "taskDescription">Description</form:label>
<form:input type = "text" path="taskDescription" required="required" />
<form:errors path = "taskDescription" cssClass = "text-warning"/>
</fieldset>

<fieldset class = "mb-3">
<form:label path = "done">Is Completed</form:label>
<form:input type = "text" path = "done" required = "required" />
</fieldset>

<fieldset class "mb-1">
<form:label path = "targetDate">Target Date</form:label>
<form:input type = "text" path = "targetDate" required = "required"/>
</fieldset>
<br>
<form:input type = "hidden" path = "id" />
<input type = "submit" class = "btn btn-success" />
</form:form>
</div>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">
	$('#targetDate').datepicker({
	    format: 'yyyy-mm-dd'
	});
</script>
</body>
</html>