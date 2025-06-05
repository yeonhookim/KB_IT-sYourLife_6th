<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Todo 목록</title>
</head>
<body>
<h1>Todo 목록 보기</h1>
<c:forEach var="todo" items="${todoList}">
    <div>${todo}</div>
</c:forEach>
<a href="${pageContext.request.contextPath}/todo/view">상세보기</a>
<br>
<a href="${pageContext.request.contextPath}/todo/create">새 Todo</a>
</body>
</html>