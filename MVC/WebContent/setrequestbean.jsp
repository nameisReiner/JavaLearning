<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user3" class="beans.User" scope="request"></jsp:useBean>


<jsp:setProperty property="email" name="user2" value="jreiner@umich.edu" />
<jsp:setProperty property="password" name="user2" value="letmein" />

<jsp:forward page="getrequestbean.jsp"></jsp:forward>


</body>
</html>