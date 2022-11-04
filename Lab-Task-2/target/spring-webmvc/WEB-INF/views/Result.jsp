
<%--
  Created by IntelliJ IDEA.
  User: TANIM
  Date: 11/4/2022
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


 <%
     Integer num1=(Integer)request.getAttribute("number1");
     Integer num2=(Integer) request.getAttribute("number2");

     String op=(String) request.getAttribute("operation");
    Integer Result=(Integer) request.getAttribute("result");

     %>

<h1>Number1 is <%=num1%> </h1>
<h1> Number2 is <%=num2%> </h1>
 <h1>Operation is <%=op%> </h1>
<h1> Result is <%=Result%></h1>
</body>
</html>
