<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/26
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/user/addUser" method="post">
    userName:<input name="uname" ><br>
    address:<input name="address"><br>
    birthday:<input name="birthday" ><br>
    sex:<input name="sex"><br>
    <input type="submit" value="保存">
</form>

</body>
</html>
