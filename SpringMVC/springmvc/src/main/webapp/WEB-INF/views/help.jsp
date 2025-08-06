<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>

<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help page</title>
</head>
<body>
<% String Copy = (String) request.getAttribute("Copy");
String time = (String) request.getAttribute("time");
%>
<h1>Help me to copy <%=Copy%></h1>
<h1>Help me to copy using laptop or mobile phone ${Copy} </h1>
<h1>Time : <%=time %></h1>
<h1>${time }</h1>


<hr>
<c:forEach var="item" items="${ids}">
	<h1>${item }</h1>
</c:forEach>
<hr>
<hr>

<h1>${dec }</h1>
<h1>${np }</h1>
</body>
</html>