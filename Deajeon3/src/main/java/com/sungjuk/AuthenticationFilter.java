package com.sungjuk;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// Filter
// survlet 실행 전에 ㅈ가동
// 공통 기능을 정의할 때 (인증, 권한부여, 압축)

@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter extends HttpFilter implements Filter {
	private ServletContext context;
    public AuthenticationFilter() {
        super();
       
    }
    //초기화 동작
    public void init(FilterConfig fConfig) throws ServletException {
    	this.context = fConfig.getServletContext();
    	this.context.log("로깅 필터가 초기화 되었습니다. ");
    }
	public void destroy() {	
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String url = req.getRequestURI();
		this.context.log("Requested Resource::" + url);
		HttpSession session = req.getSession(false);
		//html은 통과
		//jsp하고 servlet은 통과시키지 않음
		//세션은 jsp와 servlet을 사용할 때 생성
		
		if(session == null && !(url.endsWith("html") || url.endsWith("LoginServlet"))) { // 로그인은 작동해야하기 때문에 작동
			this.context.log("인증되지 않은 요청입니다. ");
			res.sendRedirect("Login.html");
		}else {
			chain.doFilter(request, response);
		}
	}

	
	

}
