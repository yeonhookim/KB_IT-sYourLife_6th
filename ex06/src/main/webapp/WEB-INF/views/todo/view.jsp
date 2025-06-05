<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>View Todo</title>
</head>
<body>
<h1>Todo 보기</h1>
<a href="${pageContext.request.contextPath}/todo/list">목록 보기</a> |
<a href="${pageContext.request.contextPath}/todo/update">수정하기</a>
<form action="${pageContext.request.contextPath}/todo/delete" method="POST">
  <input type="submit" value="삭제">
</form>
</body>
</html>