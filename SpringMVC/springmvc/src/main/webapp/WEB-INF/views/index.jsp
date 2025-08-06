<%@page import="java.util.List"%>
<html>
<body>
<h2>Hello World!</h2>
<h1>this is my project</h1>

<%
String name = (String) request.getAttribute("name");
%>

<h1>Name is <%=name %></h1>

<%
List<String> friuts = (List<String>) request.getAttribute("Friuts");
for(String s: friuts){
%>
	
	<h1><%=s %></h1>
	
<% 	
}
%>
</body>
</html>
