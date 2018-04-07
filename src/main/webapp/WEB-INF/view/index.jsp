<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Treadstone-Welcome</title>
</head>
<body>
	<h2>Welcome to ${projectName}</h2>
	<form:form action="${pageContext.request.contextPath}/web/checkenum.do" method="get" commandName="enumForm">
		<form:input type="text" path="enumString"/>		
		<input type="submit" value="Submit"/>
		<form:label path="enumResult">${enumResult}</form:label>
	</form:form>
	
	<form action="${pageContext.request.contextPath}/web/pathValCheck/hello.do" method="get">		
		<input type="submit" value="Submit"/>
	</form>
	<spring:url value="/web/pathValCheck/${enumResult}.do" var="pathValCheck"/>
	
	<button onclick="location.href='${pathValCheck}'">Path Variable Check</button>
	
</body>
</html>