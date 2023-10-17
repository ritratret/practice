<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.sungjuk.*"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<AccountDto> vec = new ArrayList<AccountDto>();
	vec = (ArrayList<AccountDto>) request.getAttribute("accountmember");	
%>
<center>
	<h3> 회원 보기 </h3>
	<table border=1>
		<tr>
			<th> 이름 </th> <th> 아이디 </th> <th> 비밀번호 </th>
		</tr>
		<%
			Iterator itr = vec.iterator();
			while(itr.hasNext()){
				AccountDto dto = (AccountDto) itr.next();
		%>
			<tr>
				<td><%=dto.getAccount() %></td><td><%=dto.getId() %></td><td><%=dto.getPassword() %></td>
			</tr>
		<%}%>
		<tr>
		
	</table>
	<center>
		<h3>확인했습니다</h3>
		<a href="./sungjukmenu.html">메뉴로 돌아가기</a>
	</center>
</center>
</body>
</html>