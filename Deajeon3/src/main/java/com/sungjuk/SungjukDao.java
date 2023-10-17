package com.sungjuk;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
// dao dto 나누는 이유: 재사용성
// 분리된걸 생각하면서 작업. servlet에서 데이터받아 반응하고 jsp로 보내서 실행하는 루트

import com.dbcp.DbcpBean2;

public class SungjukDao { // 어디에 넣으라는데 뭘넣으란건지 모르곘음
	private Connection conn;

	public SungjukDao() {
		conn = new DbcpBean2().getConn();
	}

	public int registerMember(SungjukDto st) {
		CallableStatement stmt = null;
		int result = 0;
		try {
			String sql = "call student_insert(?,?,?,?,?,?)"; // 쿼리명령문이랑 똑같음
			stmt = conn.prepareCall(sql);
			stmt.setString(1, st.getName());
			stmt.setInt(2, st.getKor());
			stmt.setInt(3, st.getMat());
			stmt.setInt(4, st.getEng());
			stmt.setString(5, st.getSchoolcode());
			stmt.registerOutParameter(6, java.sql.Types.INTEGER); // 데이터 지정X. out변수로 데이터 타입을 지정해줌
			stmt.execute(); // 리턴값을 받지 않음
			result = stmt.getInt(6); // select에서 값을 가져오는 형태. 지금은 INTEGER라서 getInt. 6번값 갖고오면 이게 리턴값이된다
			stmt.close();
		} catch (Exception e) {
			result = 3;
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

	// select(전체 데이터를 갖고옴) 데이터는 배열(ArrayList)
	public ArrayList<SungjukDto> selectMember() {
		CallableStatement stmt = null;
		ArrayList<SungjukDto> list = new ArrayList<SungjukDto>();
		try {
			stmt = conn.prepareCall("{call student_select()}");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int mat = rs.getInt("mat");
				int eng = rs.getInt("eng");
				SungjukDto sungjuk = new SungjukDto();
				sungjuk.setName(name);
				sungjuk.setKor(kor);
				sungjuk.setMat(mat);
				sungjuk.setEng(eng);
				list.add(sungjuk);
			}
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			this.close();

		}
		return list;
	}

	// update
	public int updateMember(SungjukDto st) {
		CallableStatement stmt = null;
		int result = 0;
		try {
			String sql = "call student_update(?,?,?,?,?,?)";
			stmt = conn.prepareCall(sql);
			stmt.setInt(1, st.getBunho());
			stmt.setString(2, st.getName());
			stmt.setInt(3, st.getKor());
			stmt.setInt(4, st.getMat());
			stmt.setInt(5, st.getEng());
			stmt.registerOutParameter(6, java.sql.Types.INTEGER);

			int affectedrowcount = stmt.executeUpdate(); // 변화된 행수를 갖고있음
			System.out.println("변화된 행수: " + affectedrowcount);
			result = stmt.getInt(6);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
		return result;
	}

	// delete
	public int deleteMember(SungjukDto st) {
		CallableStatement stmt = null;
		int result = 0;
		try {
			stmt = conn.prepareCall("call student_delete(?,?)");
			stmt.setString(1, st.getName());
			stmt.registerOutParameter(2, java.sql.Types.INTEGER);
			boolean success = stmt.execute(); // resultset이면 true 아니면 false
			// execute, executeQuery(결과값:resultset), executeUpdate()결과값:변화된 행수
			// execute는 select, update, insert into, delete에 모두 사용이 가능하다
			// 그래서 이 결과들을 구분하기 위해, 리턴값이 boolean으로 받음. true - resultset 있음 / false - 없음
			// executeQuery(결과값:resultset), executeUpdate() 사용하면 결과값이 확실하다
			System.out.println(success);
			result = stmt.getInt(2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close();

		}
		return result;
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
