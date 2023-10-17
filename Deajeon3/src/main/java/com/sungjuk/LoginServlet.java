package com.sungjuk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//기본으로 지정된 아이디와 패스워드
	//여러사람이 쓸 수 있도록 DB하고 연결해 처리하시오
	private final String userID="a";
	private final String password="b";
       
    
    public LoginServlet() {super();}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());\
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		if(userID.equals(user) && password.equals(pwd)) { // 들어온 값이 동일하면 성공 
			HttpSession session = request.getSession(); // 세션:유저마다 새롭게 생성
			session.setAttribute("user", "korea"); // 로그아웃하고 사이트에서 나갈때까지 유지된다 
			session.setMaxInactiveInterval(60); // 30*60.. 30분 유지된다는 뜻
			Cookie userName = new Cookie("user", user); // 쿠키는 클라이언트의 웹브라우저에 저장된다
			userName.setMaxAge(30*60);
			response.addCookie(userName);
			response.sendRedirect("LoginSuccess.jsp");
		}else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html"); // . 으로 연결한걸 체이닝..체인.
			PrintWriter out = response.getWriter(); // 출력객체를 얻은 다음에 
			out.println("<font color=red>id나 password가 잘못되었습니다.</font>");
			// 밑에 dispatcher가 나오면 이거랑 로그인화면이 동시에 실행가능하다
			rd.include(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
