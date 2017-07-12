<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>

<script>
	window.onload = function() {
		document.getElementById("id").onblur = function() {
			// id 입력 후 포커스 이동시 실행되는 함수
			alert(document.getElementById("id").value);
		}
		document.getElementById("registerform").onsubmit = function() {
			alert("중복 체크 해주세요");
			// false 값을 리턴하면 페이지 이동 X 
			return false;
		}
	}
</script>

</head>
<body>
	<!-- 비밀번호가 있기 때문에 method="post" -->
	<form action="saveMember" method="post" id="registerform">

		<table align="center" border="1">

			<tr>
				<td colspan="2" align="center">
					<h2>회원가입</h2>
				</td>
			</tr>

			<tr>
				<td align="right">아이디</td>
				<td><input type="text" name="id" id="id" size="20"
					required="required" /></td>
			</tr>

			<tr>
				<td align="right">비밀번호</td>
				<td><input type="password" name="pw" id="pw" size="20"
					required="required" /></td>
			</tr>

			<tr>
				<td align="right">이름</td>
				<td><input type="text" name="name" id="name" size="20"
					required="required" /></td>
			</tr>

			<!-- name : 서버에서 사용하기 위해, id : 자바 스크립스에서 사용하기 위해 설정, size="길이" -->

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="회원가입" /></td>
			</tr>

		</table>

	</form>

</body>
</html>