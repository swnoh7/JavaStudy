package model;

public class MemberDTO {
	// Model 역할
	// DTO --> Data Transfer Object --> getter, setter 메소드 (둘다 가능)
	// VO --> Value Object --> getter 메소드 (값을 가져오기만함)
	
	// 1. 필드(아이디, 비밀번호, 이름, 나이, 점수)
	
		public String id;
		
		public void setId(String id) {
			this.id = id;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setScore(int score) {
			this.score = score;
		}
		
		public String getId() {
			return id;
		}
		public String getPw() {
			return pw;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public int getScore() {
			return score;
		}
		
		public String pw;
		public String name;
		public int age;
		public int score;
		
		// 2. 메소드(모든 매개 변수를 받는 생성자 1개, getter 메소드)
		
		public MemberDTO(String id, String pw, String name, int age, int score) {
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.age = age;
			this.score = score;
		}
		
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
