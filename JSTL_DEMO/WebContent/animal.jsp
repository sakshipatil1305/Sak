<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="animal_name" value="${param.animal }"></c:set>
<c:choose>
<c:when test="${animal_name == 'TIGER' }">
It's a Tiger.
</c:when>
<c:when test="${animal_name == 'LION' }">
It's Lion.
</c:when>
<c:when test="${animal_name eq 'PANDA' }">
It's a Panda.
</c:when>
<c:otherwise>
INVALID CHOICE!
</c:otherwise>
</c:choose>

</body>
</html>