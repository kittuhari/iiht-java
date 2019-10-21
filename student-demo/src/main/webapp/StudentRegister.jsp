<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form action="addstudent" method="post" modelAttribute="student">
<form:input path="studentId" type="text" />
<form:input path="studentname" type="text"/>
<form:input path="email" type="text"/>
<form:input path="mobile" type="text"/>



<input type="submit" value="Add Employee">




</form:form>

</body>
</html>