<%@ page import="com.example.demo.loginBean" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/05/2024
  Time: 11:38 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        //Step1 call Controller
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //Step 2 Call insta
        loginBean loginBean = new loginBean();
        boolean status = false;
        status = loginBean.checkLogin(username,password);

        if(status){%>
        <%-- Step3 --%>
    <jsp:forward page="success.jsp"/>

    <%} else {%>
    <jsp:forward page="fales.jsp"/>
    <%}%>

</head>
<body>

</body>
</html>
