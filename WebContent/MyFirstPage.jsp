<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ぶっぶーですわ！</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style type="text/css">
h1 {
    color:red;
    font-family: verdana;
    font-size: 50px;
}
div h1{
	text-align:center;
}
.box1{
	background-color:#FFAC55;
	width:200px;
	height:100px;
	display: none;
}
.sample {
    display:none
}
</style>
</head>
<body>
	<div><h1>ぶっぶーですわ！</h1></div>
	<%
	int a = 2;
	if(a < 1){
		out.println("ぶっぶーですわ！");
	}else{
		out.println("ぶっぶーですわ！ぶっぶーですわ！ぶっぶーですわ！");
	}
	%>
	
<%-- <% System.out.println("ぶっぶーですわ！");%> --%>
<hr>
    <script>
        var a = 6;
        if(a<5){
        		console.log("asdfasdf");
        }else{
        		console.log("ぶっぶーですわ！ぶっぶーですわ！");
        }
		
		
		
    </script>
	
</body>
</html>