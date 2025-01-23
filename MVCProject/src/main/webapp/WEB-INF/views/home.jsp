<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>MY name is Yashas</h1>
<h1><%String name=(String) request.getAttribute("name");%> </h1>
<%=name %>
<h1>${name }</h1>
<%String usn=(String)request.getAttribute("USN"); %>
<%=usn %>
<h1>${email }</h1>
<h1>${password }</h1>


</body>
</html>