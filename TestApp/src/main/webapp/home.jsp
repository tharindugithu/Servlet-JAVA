 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
    <%
    //only refer to page scope
     pageContext.setAttribute("name","Tharindu",PageContext.SESSION_SCOPE);
    //set a session scope pageContext.setAttribute("name","Tharindu",PageContext.SESSION_SCOPE);access all the pages
    %>
</body>
</html>