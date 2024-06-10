<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 출력 화면</title>
<link rel="icon" href="../../img/logo.png" type="image/x-icon">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%   // 이영역 안에는 자바처럼 사용 가능 하다.
	Object result = request.getAttribute("result");
	int cnt = Integer.parseInt(request.getAttribute("cnt").toString());  // 정수형으로 데이터 받기
	String txt = request.getAttribute("txt").toString();
	//out.println(cnt + " : " + txt);   //jsp에서는 앞에 system이 필요 없다 콘솔에서 출력하는것이 아니기 떄문에.
%>
<div class="container mt-3">
	<div class="d-grid gap-3">
		<a href="Form" class="btn btn-success btn-block">돌아가기</a>
	</div>
	<h1 class="text-center mt-3">입력한 결과</h1>
	<ol class="list-group list-group-numbered">
<%  if(cnt == 0){%>
<li class="list-group-item">입력 받은 값이 없습니다</li>

<%  } else{
	for(int i = 0 ; i < cnt; i++){
		
%>
    	<li class="list-group-item"><%=txt%></li>
<%
	}
}
%>
	</ol>
</div>
</body>
</html>