<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
  
<!DOCTYPE html>
<html  >
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
  <!-- print a one student data -->
  <!-- ${student.toString()}   -->
  
  <!-- print a list of students JSTL way (Jakarta Standard Tag Library) -->
  <c:forEach items="${students}" var="s">
     ${s}
  </c:forEach>
</body>
</html>