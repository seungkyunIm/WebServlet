<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 화면</title>
<link rel="icon" href="<%=request.getContextPath()%>/www/img/logo.png" type="image/x-icon">
<link href="<%=request.getContextPath()%>/www/lib/bootstrap@5.2.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-3">
	<h1 class="text-center">데이터를 입력하세요</h1>
	<form action="/WebServlet/Result" method="get">  <!-- input이 총 3개가 있다. form 데이타라고 한다. method를 post로 변경 가능하나 java에서 메서드안의 내용도 변경해주어야한다.-->
		<div class="mb-3 mt-3">
			<label for="cnt" class="form-label">회전수 :</label>
			<input type="number" class="form-control" id="cnt" name="cnt" value="0">  <!-- input 1개 -->
		</div>
		<div class="mb-3 mt-3">
			<label for="txt" class="form-label">내용 :</label>
			<input type="text" class="form-control" id="txt" name="txt" placeholder="내용을 입력하세요." required="required" autocomplete="off"> <!-- input 2개 -->
		</div>
		<div class="d-grid gap-3">
			<input type="submit" value="전송" class="btn btn-primary btn-block"> <!-- input 3개  type = submit 이라면 전송 -->
		</div>
	</form>
</div>
</body>
</html>