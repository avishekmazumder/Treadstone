<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Treadstone - Message Instruction Page</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/jmsTest/sendMessage.do" type="post">	
		<p>
			<label>Enter Message to be sent: </label>
			<input type="text" name="msg" id="msg"/>
		</p>
		<p>
			<input type="submit" value="Submit">
		</p>		 
	</form>
	<div>
		<p>${successMessage}</p>
	</div>
</body>
</html>