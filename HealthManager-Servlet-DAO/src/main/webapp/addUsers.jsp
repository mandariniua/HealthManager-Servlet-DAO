<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="AddUsersServlet" method="post">
	Email <br><input type="text" name="email">
	<br>
	First Name <br>	<input type="text" name="firstName">
	<br>
	Second Name <br> <input type="text" name="secondName">
	<br>
	Password <br> <input type="password" name="password">
	<br>
	<input type="submit"/>
</form>

</body>
</html>