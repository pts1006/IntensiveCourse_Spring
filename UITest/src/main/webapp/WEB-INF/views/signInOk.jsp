<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력 화면</title>
</head>
<body>
	<div align="center">
		<c:if test="${check eq 'success'}">
			<div>
				<h1>${member.id }님안녕하세요.</h1>
			</div>
			<button onclick="location.href = 'signOut'">로그아웃</button>
			<button onclick="location.href = 'home'">홈</button>
		</c:if>
	</div>
</body>
</html>