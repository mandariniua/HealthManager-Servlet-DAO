<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Dish</title>
</head>
<body>
<%if(request.getAttribute("dishList") !=null) {
	response.sendRedirect("DishAllViewServlet");
}
	%>
	<table>
	
	<tr>
	<th>Id</th>
	<th>Dish Name</th>
	<th>Kcal/portion</th>
	</tr>
	
	<c:forEach var="dish" items="${dishList}">
				<tr><td><c:out value="${dish.id}"/></td>
				<tr><td><c:out value="${dish.dishName}"/></td>
				<tr><td><c:out value="${dish.kcal}"/></td>
				</tr>
				</c:forEach>
	</table>

</body>
</html>