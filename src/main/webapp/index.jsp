<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<% response.sendRedirect("ActionDebut.do"); %>
<a href="hello-servlet.do">Hello Servlet</a>
</body>
</html>