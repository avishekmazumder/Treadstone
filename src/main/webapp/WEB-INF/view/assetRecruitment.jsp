<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Treadstone - Recruitment</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/asset/recruit.do" commandName="asset" method="post">
	<table>
		<tr>
			<td><label>Name</label></td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td><label>Country of operation</label></td>
			<td>
				<form:select path="postedCountry">
					<form:option value="None">--Select--</form:option>
					<form:options items="${countryList }"/>
				</form:select>
			</td>
		</tr>
		<tr>
			<td><label>Gender</label></td>
			<td>
				<form:radiobutton path="gender" value="Male" label="Male" />
				<form:radiobutton path="gender" value="Female" label="Female"/>
			</td>
		</tr>
		<tr>
			<td><label>Skills</label></td>
			<td>
				<form:checkboxes items="${skillsList}" path="skills"/>
			</td>
		</tr>	
	</table>
	<input type="submit" value="Submit">
</form:form>

</body>
</html>