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
	ArrayList<SungjukDto> vec = new ArrayList<SungjukDto>();
	vec = (ArrayList<SungjukDto>) request.getAttribute("studentsungjuk");	
%>
<center>
	<h3> 성적 출력 </h3>
	<table border=1>
		<tr>
			<th> 이름 </th> <th> 국어</th> <th> 영어 </th> <th> 수학 </th>
		</tr>
		<%
			Iterator itr = vec.iterator();
			while(itr.hasNext()){
				SungjukDto dto = (SungjukDto) itr.next();
		%>
			<tr>
				<td><%=dto.getName() %></td><td><%=dto.getKor() %></td><td><%=dto.getEng() %></td><td><%=dto.getMat()%></td>
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