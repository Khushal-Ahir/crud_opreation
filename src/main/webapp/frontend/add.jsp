<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
.registration {
	display: flex;
	justify-content: space-between;
	width: 30%;
	gap: 60px;
}

form {
	display: grid;
	justify-content: center;
	align-items: center;
}
</style>
</head>
<body>
	<form action="add" method="post">
		<div class="registration">
			<label>Ename </label> <input name="ename" type="text" />
		</div>
		<div class="registration">
			<label>Mobile No. </label> <input name="mobile" type="tel" />
		</div>
		<div class="registration">
			<label>Domain </label> <input name="domain" type="text" />
		</div>
		<div class="registration">
			<label>Email </label> <input name="email" type="email" />
		</div>
		<div class="registration">
			<label>Salary</label> <input name="sal" type="number" />
		</div>

		<div class="registration">
			<button>Done</button>
		</div>
	</form>
	<a href="/Crud_Operation"><button>Home</button></a>
</body>
</html>