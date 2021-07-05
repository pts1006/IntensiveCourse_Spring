<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈페이지</title>
</head>
<body>
	<div align = "center">
		<div><h1>홈</h1></div>
		<c:choose>
			<c:when test="${empty ID }">
				<button onclick = "location.href = 'signIn'">로그인</button>
				<button onclick = "location.href = 'signUp'">회원 가입</button>
			</c:when>
			<c:otherwise>
				<button onclick = "location.href = 'signOut'">로그아웃</button>
				<div>
					<a href = "memberList">회원 리스트</a>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>