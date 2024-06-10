<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 화면</title>
<link rel="icon" href="<%=request.getContextPath()%>/www/img/logo.png" type="image/x-icon">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-3">
	<h1 class="text-center">데이터를 입력하세요</h1>
	<form action="/WebServlet/Result" method="get">  
	<!-- input이 총 3개가 있다. form 데이타라고 한다. method를 post로 변경 가능하나 java에서 메소드도 doGet에서 doPost변경해주어야한다.-->
		<div class="mb-3 mt-3">
			<label for="cnt" class="form-label">회전수 :</label>
			<input type="number" class="form-control" id="cnt" name="cnt" value="0">  <!-- input 2번째 -->
		</div>
		<div class="mb-3 mt-3">
			<label for="txt" class="form-label">내용 :</label>
			<input type="text" class="form-control" id="txt" name="txt" placeholder="내용을 입력하세요." required="required" autocomplete="off"> <!-- input 2개 -->
		</div>
		<div class="d-grid gap-3">
			<input type="submit" value="전송" class="btn btn-success btn-block text-warning"> <!-- input 3번째  type = submit 이라면 전송 -->
		</div>
		<div class="d-grid gap-3">
			<input type="submit" value="전송2" class="btn btn-warning btn-block text-primary"> <!-- input 3번째  type = submit 이라면 전송 -->
		</div>
		<div class="d-grid gap-3">
			<input type="submit" value="전송3" class="btn btn-primary btn-block text-orange"> <!-- input 3번째  type = submit 이라면 전송 -->
		</div>
		<div class="d-grid gap-3">
			<input type="submit" value="전송4" class="btn btn-info btn-block text-danger"> <!-- input 3번째  type = submit 이라면 전송 -->
	


	</form>
</div>
</body>
</html>