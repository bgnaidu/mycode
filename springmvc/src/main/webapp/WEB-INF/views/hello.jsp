<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<%
		Integer id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		Integer salary = (Integer) request.getAttribute("salary");
		out.println("id:" + id);
		out.println("name:" + name);
		out.println("salary:" + salary);
	%>
	
  <br />
	Id:
	<b>${id}</b> 
	Name
	<b>${name}</b> 
	Salary:
	<b>${salary}</b>

</body>
</html>