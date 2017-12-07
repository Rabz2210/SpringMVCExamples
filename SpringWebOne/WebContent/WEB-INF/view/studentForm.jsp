<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<form:form action="showform" modelAttribute="theStudent">
		Fname:<form:input path="fname" />
		<br><br>
		Lname:<form:input path="lname"/>
		<br><br>
		Country:
		<form:select path="countary">
			<form:options items="${theStudent.coptions}" />
		</form:select>
		<input type="submit" value="submit">
	</form:form>
</center>

</body>
</html>