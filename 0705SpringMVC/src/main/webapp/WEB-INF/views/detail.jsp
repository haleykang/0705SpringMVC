<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상세 보기</title>
</head>
<body>

	<table border="1" align="center">
		<tr>
			<td colspan="2" align="center">
				<h2>상세보기</h2>
			</td>
		</tr>

		<tr>
			<td>글 번호</td>
			<td>${board.num}
		</tr>
		<tr>
			<td>조회수</td>
			<td>${board.readcnt}</td>

		</tr>
		<tr>
			<td>작성일</td>
			<td>${board.regdate}</td>
		</tr>

		<tr>
			<td>작성자</td>
			<td>${board.writer}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${board.title}</td>
		</tr>

		<tr>
			<td>내용</td>
			<td><textarea rows="10" cols="30" readonly="readonly">${board.content}</textarea></td>
		</tr>

		<tr>
			<td colspan="2" align="center"><input type="button" value="삭제"
				id="delBt" /> <input type="button" value="목록" id="listBt" /> <input
				type="button" value="메인" id="mainBt" /></td>
		</tr>


	</table>

	<script>
		document.getElementById("delBt").onclick = function() {
			
			location.href="./delete?num=" + ${board.num}
		};

		document.getElementById("listBt").onclick = function() {
			location.href="./boardList"
		};

		document.getElementById("mainBt").onclick = function() {
			location.href="./";
		};
		
	</script>

</body>
</html>