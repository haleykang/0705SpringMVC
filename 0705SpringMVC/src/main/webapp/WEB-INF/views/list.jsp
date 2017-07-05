<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 반복문이나 조건문 사용을 위한 태그 라이브러리 추가 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>전체보기</title>
</head>
<body>

	<table border="1" align="center">
		<tr>
			<td colspan="4" align="center">
				<h2>전체 목록 보기</h2>
			</td>
		</tr>
		<tr>
			<th width="50">번호</th>
			<th width="200">제목</th>
			<th width="100">작성자</th>
			<th width="100">조회수</th>
		</tr>
		<c:forEach var="board" items="#{list}">
		<tr align="center">
			<td>${board.no}</td>
			<td>${board.title}</td>
			<td>${board.writer}</td>
			<!-- 조회수는 보통 우측 정렬 -->
			<!-- &nbsp; 공백 제거 명령문!!!! -->
			<td align="right">${board.readcount}&nbsp;</td>
		</tr>
		</c:forEach>

	</table>

</body>
</html>