package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// id,pw 수정할 점수
		System.out.println("===== 회원정보 수정 =====");
		System.out.println("ID 입력 : ");
		String id = sc.next();
		System.out.println("PW 입력 : ");
		String pw = sc.next();
		System.out.println("수정할 점수 입력 : ");
		int nScore = sc.nextInt();

		//
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest";

			String user = "root";

			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공!");
			} else {
				System.out.println("연결 실패...");
			}

			String sql = "update bigdatamember set score = ? where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, nScore);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("점수 수정 성공~~");
			} else {
				System.out.println("점수 수정 실패ㅠㅠ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
