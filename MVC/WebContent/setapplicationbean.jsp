<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user4" class="beans.User" scope="application"></jsp:useBean>


<jsp:setProperty property="email" name="user4" value="jreiner@umich.edu" />
<jsp:setProperty property="password" name="user4" value="letmein" />

<jsp:forward page="getrequestbean.jsp"></jsp:forward>


</body>
</html>