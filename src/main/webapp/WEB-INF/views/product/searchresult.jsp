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
<h1> 다음과 같이 검색해 주세요 </h1>
<form action="productsearchlist" >
<select name="item"> 
<option> 제목 검색</option>
<option> 지은이 검색</option>
<option> 출판사 검색</option>
</select>
검색어입력:<input type=text name="searchword">
<input type=submit value="검색요청" >
</form>
<h1> 검색 결과</h1>
<c:forEach items="${productlist }" var="dto">
<h3> ${dto }</h3>
 </c:forEach>
</body>
</html>