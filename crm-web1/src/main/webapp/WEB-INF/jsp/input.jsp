<%--
  Created by IntelliJ IDEA.
  User: Y
  Date: 2018/8/21
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>录入</title>
  </head>
  <body>
  <form method="post" action="${pageContext.request.contextPath}/save.action">
    姓名：<input type="text" name = "name"/></br>
    年龄：<input type="text" name = "age"/></br>
    性别：<input type="text" name = "gender"/></br>
    <input type="submit" value="提交"/>
  </form>
  </body>
</html>
