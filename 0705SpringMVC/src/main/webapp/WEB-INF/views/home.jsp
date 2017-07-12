<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>웹 프로젝트 샘플</title>
<!-- jquery 링크 설정 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	// jquery가 문서 구조 파악이 끝나면 호출되는 함수
	$(function() {
		$.ajax({
			url : "test3",
			dataType : "json",
			success : function(data) {
				/* $('#disp').html(data);	 */
				//1. test2(맵) 일 땐 - alert(data.id); // id에 저장된 값 나옴 data.key값 입력하면 그 값 나옴
				//2. test3(list일때) 일때
				for (imsi in data) {
					// alert(data[imsi]);
				}
			}
		});

	});
</script>
</head>
<body>

	<a href="boardList">전체보기</a>
	<a href="boardwrite">게시글 작성</a>
	<a href="toregister">회원가입</a>

	<div id="disp"></div>

</body>
</html>