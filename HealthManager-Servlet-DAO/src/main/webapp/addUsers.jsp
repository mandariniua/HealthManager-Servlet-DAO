<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create account</title>
<link rel="stylesheet" href="styleLogin.css">
</head>
<body>

<div class="login-page">
  <div class="form">
    <form action="AddUsersServlet" method="post" class="login-form">
      <input type="text" name="email" placeholder="email"/>
      <input type="text" name="firstName" placeholder="firstName"/>
      <input type="text" name="secondName" placeholder="secondName"/>
      <input type="password" name="password" placeholder="password"/>
      <button type="submit">create</button>
    </form>
  </div>
</div>

</body>
</html>