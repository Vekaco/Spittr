<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KaikaiFu
  Date: 2018/5/8
  Time: 下午8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Spittles</title>
</head>

<body>
    <h1>Recent Spittles</h1>
    <c:forEach var="spittle" items="${spittleList}">
       <li>
           <div><c:out value="${spittle.message}"/> </div>
           <div><c:out value="${spittle.time}"/> </div>
       </li>

    </c:forEach>

</body>
</html>
