<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
   
<!DOCTYPE html>
<html  >
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <c:set var="str" value="My Name is Tharindu" />
 Length: ${fn:length(str)}
 <br/>

 <c:forEach items="${fn:split(str,' ')}" var="s">
 <br/>
   ${s}
 </c:forEach>
 
 <br/>
 index of "is" word : ${fn:indexOf(str,"is")}
 
 <br/>
 word "Name" is there : ${fn:contains(str,"Name")}
 <br/>
 <c:if test="${fn:contains(str,'Name')}">
  Name is there
 </c:if>
</body>
</html>