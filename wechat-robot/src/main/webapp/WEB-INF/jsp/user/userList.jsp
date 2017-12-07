<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表</title>

<script type="text/javascript">
</script>

</head>
<body >
<table>
    <tr>
        <td>用户名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>
                <c:choose>
                    <c:when test="${user.sex==1}">
                        男
                    </c:when>

                    <c:otherwise>
                        女
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>