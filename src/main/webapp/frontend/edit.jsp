<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Page</title>
<style type="text/css">
	.registration{
		display: flex;
		justify-content: space-between;
		width: 30%;
		gap: 60px;
	}
	form{
		display: grid;
		justify-content: center;
		align-items: center;
	}
</style>
</head>
<body>
	
	<form action="editEmp" method="post">
	<div class="registration">
		<label>Ename </label>
		<input name="ename" type="text" value="${lsit.getEname()}"/>
	</div>
	<div class="registration">
		<label>Mobile No. </label>
		<input name="mobile" type="tel" value="${lsit.getMobile()}"/>
	</div>
	<div class="registration">
		<label>Domain </label>
		<input name="domain" type="text" value="${lsit.getDomain()}"/>
	</div>
	<div class="registration">
		<label>Email </label>
		<input name="email" type="email" value="${lsit.getEmail()}"/>
	</div>
	<div class="registration">
		<label>Salary</label>
		<input name="sal" type="number" value="${lsit.getSal()}"/>
	</div>
	<div class="registration">
<%--		<a href="editEmp?id=${list.getId()}"><button>Update</button></a> --%>
		<button>Update</button>
	</div>
	
	</form>
	
</body>
</html>