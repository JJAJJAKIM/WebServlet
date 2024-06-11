<%@page import="db.DBTable"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>사용자 목록</title>
<link rel="icon" href="../../img/logo.png" type="image/x-icon">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
	.cursor-pointer {cursor: pointer;}
</style>
</head>
<body>

<% 
	List<DBTable> list = (List<DBTable>)request.getAttribute("list");
	
%>

	<div class="container mt-3">
	  <h1 class="display-1 text-center">사용자 목록</h1>
	  <div class="btn-group">
	    <a href="Create" class="btn btn-primary">사용자 추가</a>
	  </div>
	  <table class="table table-hover mt-3">
	    <thead class="table-dark">
	      <tr>
	      	<th>이름</th>
	        <th>이메일</th>
	        <th>가입날짜</th>
	      </tr>
	    </thead>
	    <tbody>
	    <% for(int i = 0; i < list.size(); i++ ) {
	    	String no = list.get(i).getNo();
	    	%>

	      <tr class="cursor-pointer" onclick="location.href ='Select?no=<%=no%>'"> 
	        <td><%=list.get(i).getName() %></td>
	        <td><%=list.get(i).getEmail() %></td>
	        <td><%=list.get(i).getRegDate() %></td>
	      </tr>
	     <%} %> 
	    </tbody>
	  </table>
	</div>
</body>
</html>
