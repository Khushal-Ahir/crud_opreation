<%@page import="crud.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Employee data</h1>
	${msg}
	<h1>${success}</h1>
	<table border="1" align="center" cellpadding="20px">
		<tr>
			<th>Ename</th>
			<th>Mobile</th>
			<th>Domain</th>
			<th>Email</th>
			<th>Salary</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<%--
			<tr>
				<td>${lists.get(0).ename}</td>
				<td>${lists.get(0).mobile}</td>
				<td>${lists.get(0).domain}</td>
				<td>${lists.get(0).email}</td>
				<td>${lists.get(0).sal}</td>
			</tr>
		 --%>
		<c:forEach var="i" items="${lists}">		
		<tr>
			<td>${i.ename}</td>
			<td>${i.mobile}</td>
			<td>${i.domain}</td>
			<td>${i.email}</td>
			<td>${i.sal}</td>
			<td><a href="deleteEmp?id=${i.id}"><button>Delete</button></a></td>
			<td><a href="update?id=${i.id}"><button>Edit</button></a></td>
		</tr>
		</c:forEach>
	</table>
	
	<a href="/Crud_Operation"><button>Home</button></a>
</body>
</html>