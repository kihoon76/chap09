<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.err {
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
<form action="/login" method="post">
	아이디   : <input type="text" name="id" />	<br/>
	패스워드 : <input type="password" name="pw"><br/>
	<c:if test="${!empty errorMsg}">
	<span class="err"><c:out value="${errorMsg }"></c:out></span>
	</c:if>
	<hr>
	<button type="submit">전송</button>
</form>
</body>
</html>