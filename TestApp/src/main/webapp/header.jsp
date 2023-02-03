<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%  
   //String str = config.getInitParameter("name");
   String str = (String)request.getSession().getAttribute("name");
   out.print(str);
   %>
   <%= 9+5 %>
</body>
</html>