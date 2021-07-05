<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
	#frm {
	    display: flex;
	    flex-direction: column;
	    align-items: center;
	    margin-top: 300px;
	}
	
	#btn {
		margin-top : 10px;
	}
</style>
<head>
<meta charset="UTF-8">
<title>입력 화면</title>
</head>
<body>
	<div>
		<form id = frm method = "post" action = "signInForm">
			<div>
				<input type = "text" name = "id" placeholder = "ID">
			</div>
			<div>
				<input type = "password" name = "pwd" placeholder = "password">
			</div>
		<input id = "btn" type = "submit" value  = "로그인">
		</form>
	</div>
</body>
</html>