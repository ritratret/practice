package com.sungjuk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AccountServlet") // SungjukServlet SungjukServlet = new SungjukServlet() <이런 의미가 있는거지 같은건 아님
public class AccountServlet extends HttpServlet { // 서블릿에 대한 인스턴스
	private static final long serialVersionUID = 1L;
       
    
    public AccountServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		String str = request.getParameter("action"); // insert, select, update, delete
		response.setContentType("text/html; charset=UTF-8");
		
		
		// INSERT
		if (str.equals("memberinsert")) {
			// 이름,아이디,비밀번호 
			AccountDao dao = new AccountDao();
			String account = request.getParameter("account");
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			//String schoolcode = request.getParameter("schoolcode");
			AccountDto dto = new AccountDto();
			dto.setAccount(account);
			dto.setId(id);
			dto.setPassword(password);
			
			int result = dao.joinAccount(dto);
			PrintWriter out = response.getWriter();
			if (result == 0 ) response.sendRedirect("./success2.html");
			else out.println("회원가입 실패!");
		}
		
		
		// SELECT
		else if (str.equals("memberselect")) {
			AccountDao dao = new AccountDao();
			ArrayList<AccountDto> vec = new ArrayList<AccountDto>();
			vec = dao.selectAccount();
			request.setAttribute("accountmember", vec);
			
			//전달방식 2가지
			//requestDispatcher, response.sendredirect()
			//Context는 환경과 설정 정보
			ServletContext context = this.getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/showaccount.jsp"); // 어디로 향하는지:showsungjuk.jsp
			dispatcher.forward(request, response);
		}
		
		
		// UPDATE
		else if (str.equals("memberupdate")) {
			// 번호, 이름, 국, 영, 수, 학교코드(dao에 없음)
			SungjukDao dao = new SungjukDao();
			int bunho = Integer.parseInt(request.getParameter("bunho"));
			String name = request.getParameter("name");
			int kor = Integer.parseInt(request.getParameter("kor"));
			int mat = Integer.parseInt(request.getParameter("mat"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			//String schoolcode = request.getParameter("schoolcode");
			
			SungjukDto dto = new SungjukDto();
			dto.setBunho(bunho);
			dto.setName(name);
			dto.setKor(kor);
			dto.setMat(mat);
			dto.setEng(eng);
			
			int result = dao.updateMember(dto);
			PrintWriter out = response.getWriter();
			if (result == 0 ) response.sendRedirect("./success.html");
			else out.println("수정 실패!");
		}
		
		
		// DELETE
		else if (str.equals("memberdelete")) {
			String name = request.getParameter("name");
			SungjukDto dto = new SungjukDto();
			dto.setName(name);
			SungjukDao dao = new SungjukDao();
			int result = dao.deleteMember(dto);
			PrintWriter out = response.getWriter();
			if (result == 0) response.sendRedirect("./success.html");
			else out.println("삭제 실패! ");
		}
		else response.sendRedirect("Joinmember.html");
	}
		
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
