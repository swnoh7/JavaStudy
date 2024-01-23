package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// Data Access Object :데이터에 접근하는 것을 도와주는 객체
	// DB 연결해서 insert, delete, update, select 하는 코드들의 모음
	// 메소드 형태로 코드 작성

	// 필드

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 공통으로 사용할 메소드
	// 데이터베이스 연결하는 메소드

	private void getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 사용한 자원을 반납하는 메소드
	private void getClose() {

		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 회원가입 메소드
	public int join(MemberDTO dto) {
		int row = 0;
		try {
			getConn();
			String sql = "insert into bigdatamember(ID,PW,B_NAME,AGE,SCORE)VALUES (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}
	/////////////////////////////////////////// 회원가입 메소드 끝

	// 로그인 메소드
	public MemberDTO Login(String id, String pw) {
		MemberDTO dto = null;

		try {
			getConn();

			String sql = "select * from jdbctest.bigdatamember where id = ? AND pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next() == true) {
				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				// rs에 있는 데이터 DTO 옮기기
				dto = new MemberDTO(null, null, name, age, 0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// DB연결 종료
			getClose();
		}
		return dto;
	}
	//////////////////////////////////////////// 로그인 끝

	// 삭제 메소드
	public int Delete(String id, String pw) {
		int row = 0;

		try {
			getConn();

			String sql = "Delete from bigdatamember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}
	////////////////////////////////////////////////////// 회원탈퇴 끝

	public ArrayList<MemberDTO> SelectAll() {

		MemberDTO dto = null;
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		try {
			getConn();

			String sql = "select * from jdbctest.bigdatamember";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			// true 대신 rs.next() 가능 - if-else 안써도됨.
			while (true) {
				if (rs.next() == true) {
					String id = rs.getString("id");
					String name = rs.getString("b_name");
					int age = rs.getInt("age");
					int score = rs.getInt("score");
					// 조회 결과 (rs)에 있는 데이터 DTO로 옮겨담기
					dto = new MemberDTO(id, null, name, age, score);
					// ArrayList 이용해서 dto 여러개 묶어주기
					list.add(dto);
				} else {
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;
	}

	////////////////////////////////////////////////// 회원 전체 조회 끝

	public int Update(int nScore, String id, String pw) {
		int row = 0;

		try {
			getConn();

			String sql = "update bigdatamember set score = ? where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, nScore);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

}
