<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-3.6.0.min.js" ></script>
<script>
$(document).ready(function(){

});
</script>
</head>
<body>
<h1> 리뷰 쓰기 폼 </h1>
<form action="reviewwrite" method=post>
제목:<input type=text name="title" ><br>
점수:<select name="rating" id="rating">
<option value="1">1점</option>
<option value="2">2점</option>
<option value="3">3점</option>
<option value="4">4점</option>
<option value="5">5점</option>
</select><br>
내용:<textarea rows=10 cols=100 name="contents" > test </textarea><br>

작성자:<input type=text name="member_id"><br> 
책정보:<input type=text name="book_id"><br>
<!-- 작성자:<input type=text name="member_id" value="${sessionid }" readonly ><br>  -->
<!-- 책정보:<input type=text name="book_id" value="${session_bookid }" readonly ><br>  -->
<input type=submit value="글쓰기">
</form>
</body>
</html>







