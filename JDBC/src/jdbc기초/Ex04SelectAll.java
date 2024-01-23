package jdbc기초;

import java.security.DrbgParameters.NextBytes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04SelectAll {

	public static void main(String[] args) {
		// ======= 전체 회원 조회 ========
		// ID 이름 나이 점수
		// smhrd1 스마트 20 100
		// smhrd2 스마트2 22 80
		// smhrd3 스마트3 21 95

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("DB 연결 성공");
			} else {
				System.out.println("DB 연결 실패");
			}

			String sql = "select * from jdbctest.bigdatamember";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			System.out.println("========전체 회원 조회========");
			System.out.println("ID" + "\t" + "이름" + "\t" + "나이" + "\t" + "점수");
			//true 대신 rs.next() 가능 - if-else 안써도됨.
			while (true) {
				if (rs.next() == true) {
					String id = rs.getString("id");
					String name = rs.getString("b_name");
					int age = rs.getInt("age");
					int score = rs.getInt("score");
					System.out.println(id + "\t" + name + "\t" + age + "\t" + score);
				} else {
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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

	}

}
