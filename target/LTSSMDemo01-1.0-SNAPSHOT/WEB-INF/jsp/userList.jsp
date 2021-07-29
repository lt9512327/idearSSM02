<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/26
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>

            <a href="${pageContext.request.contextPath}/user/goAddUser">添加</a>
        </td>
    </tr>
</table>

<table border="1" width="80%" cellspacing="0" cellpadding="0">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>birthday</td>
        <td>address</td>
        <td>操作</td>
    </tr>

    <c:forEach var="li" items="${list}">
        <tr>
            <td>${li.tid}</td>
            <td>${li.uname}</td>
            <td>

                <fmt:formatDate value="${li.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate>

            </td>
            <td>${li.address}</td>
            <td>操作
                <a href="${pageContext.request.contextPath}/user/findById.do?tid=${li.tid}">修改</a>
                <a href="${pageContext.request.contextPath}/user/deleteUser/${li.tid}">删除3</a>
            </td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
