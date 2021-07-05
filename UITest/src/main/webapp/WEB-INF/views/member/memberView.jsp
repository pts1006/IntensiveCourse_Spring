<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
	<div align = "center">
		<div><h1>회원 정보</h1></div>
		<div>
			<table border = "1">
				<tr>
					<th>번호</th>
					<th>아이디</th>
					<th>이름</th>
					<th>전번</th>
					<th>상태</th>
					<th>기능</th>
				</tr>
				<c:forEach var = "member" items = "${list }" varStatus="index">
					<tr>
						<td>${index.count }</td>
						<td><a href = "memberSelect?id=${member.id }">${member.id }</a></td>
						<td>${member.name }</td>
						<td>${member.tel }</td>
						<td>${member.state }</td>
						<td>
							<button onclick = "memberDelete(${member.id})">삭제</button>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>