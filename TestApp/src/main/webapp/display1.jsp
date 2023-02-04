<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>hii</h1>
  <%
  String str = (String)request.getAttribute("label");
  out.print(str);
  %>
  <!-- EL way  (expression lan) -->
  ${label}
  
  <!-- JSTL way (Jakarta Standard Tag Library) -->
    <c:out value="Hello World" />
    <c:import url="https://1337x.to/"/><!-- can fetch the website details -->
</body>
</html>