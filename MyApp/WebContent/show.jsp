<%@page import="com.pojo.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body><%-- 
<% List<Employee> list = (List<Employee>) request.getAttribute("employee");
%> --%>
<%-- 	

	<table border="1" style="color: olive; font-family: cursive;">
		<thead align="center">
			<%
				out.println("Details");
			%>
		</thead>
		<tr>

			<td>
				<%
					out.println("EmpID");
				%>
			</td>
			<td>
				<%
					out.println("Name");
				%>
			</td>
			<td>
				<%
					out.println("Salary");
				%>
			</td>
		</tr>
		<%
			for (Employee emp : list) {
		%>
		<tr>
			<td>
				<%
					out.println(emp.getEmpid());
				%>
			</td>
			<td>
				<%
					out.println(emp.getName());
				%>
			</td>
			<td><%=emp.getSalary()%></td>

		</tr>
		<%
			}
		%>

	</table>  --%>
	
	<table>
	
	<c:forEach items="${employee }" var="emp">
	<tr>
	<td>${emp.empid}</td>
	<td>${emp.name}</td>
	<td>${emp.salary}</td>
	</tr>
	</c:forEach>
	</table>

</body>
</html>