<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/5
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <hr>${msg}<hr>
  <form action="${pageContext.request.contextPath}/s/login" method="post">
    <input name="user"/>
    <input name="pwd"/>
    <button value="commit" type="submit">commit111</button>
  </form>
  <hr/>
<%--  <a href="<%=request.getContextPath()%>/s/login">asd</a>--%>
  </body>
</html>
