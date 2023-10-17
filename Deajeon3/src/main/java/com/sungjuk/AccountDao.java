package com.sungjuk;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import com.dbcp.DbcpBean3;
public class AccountDao {
	private Connection conn;
	
	public AccountDao() {
		conn = new DbcpBean3().getConn();
	}
	
	public int joinAccount(AccountDto st) {
			CallableStatement stmt = null;
			int result = 0;
			try {
				String sql =  "call account_insert(?, ?, ?) "; 
				stmt = conn.prepareCall(sql);
				stmt.setString(1, st.getAccount());
				stmt.setString(2, st.getId());
				stmt.setString(3, st.getPassword());
				stmt.registerOutParameter(4, java.sql.Types.INTEGER);
				stmt.execute(); // 리턴값을 받지 않음
				result = stmt.getInt(3);
				stmt.close();
			} catch (Exception e) {
				result = 4;
				e.printStackTrace();
			} finally {
				try {
					this.conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			return result;
		}
	
	public ArrayList<AccountDto> selectAccount() {
		CallableStatement stmt = null;
		ArrayList<AccountDto> list = new ArrayList<AccountDto>();
		try {
			stmt = conn.prepareCall("{call account_select()}");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String account = rs.getString("account");
				String id = rs.getString("id");
				String password = rs.getString("password");
				AccountDto member = new AccountDto();
				member.setAccount(account);
				member.setId(id);
				member.setPassword(password);
				list.add(member);	
			}
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			this.close();
		}
		return list;
	}
	
//	public void userCheck(HttpServletResponse response) throws IOException {
//		int result;
//		if(result == 0) {
//			
//		}else {
//			PrintWriter out=response.getWriter();
//			response.setCharacterEncoding("utf-8");
//			response.setContentType("text/html; charset=utf-8");
//			out.println("<script> alert('회원가입이 필요합니다.');");
//			out.close();
//			return;
//		}
//	}
	
	public static void alertAndGo(HttpServletResponse response, String msg, String url) { // 알립창 띄우고 이동
		try {
			PrintWriter w = response.getWriter();
			w.write("<script>alert('"+msg+"'); location.href='"+url+"';</script>");
			w.flush();
			w.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void close() {
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			conn = null;
		}
	}

}
