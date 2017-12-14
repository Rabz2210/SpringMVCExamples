<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error {color:red}
</style>
</head>
<body>
<center>
	<form:form action="showform" modelAttribute="theStudent">
		Fname:<form:input path="fname" />
		<br><br>
		Lname:<form:input path="lname"/>
		<form:errors path="lname" cssClass="error"/>
		<br><br>
		Country:
		<form:select path="countary">
			<form:options items="${theStudent.coptions}" />
		</form:select>
		
		Java:<form:radiobutton path="favLang" value="Java"/>
		Ruby:<form:radiobutton path="favLang" value="Ruby"/>
		C++:<form:radiobutton path="favLang" value="C++"/>
		PHP:<form:radiobutton path="favLang" value="PHP"/>
		<input type="submit" value="submit">
	</form:form>
</center>

</body>
</html>