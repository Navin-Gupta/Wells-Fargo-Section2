<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Provide you profile info</h1>
		<hr/>
		<%-- Map the model object with spring form --%>
		<spring:form action="save" method="post" modelAttribute="student">
			<div>
				<div><spring:label path="name">Enter name</spring:label></div>
				<div><spring:input path="name"/></div>
			</div>
			</br></br>
			<div>
				<div><spring:label path="email">Enter Email</spring:label></div>
				<div><spring:input path="email"/></div>
			</div>
			</br></br>
			<div>
				<div><spring:label path="country">Enter Country</spring:label></div>
				<div><spring:input path="country"/></div>
			</div>
			</br>
			<div>
				<div><input type="submit" value="Submit" /></div>
			</div>
		</spring:form>
	</body>
</html>