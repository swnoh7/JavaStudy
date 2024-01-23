package 월급계산프로그램;

public class RegularEmployee extends Employee {
	

	//보너스
	private int bonus;
	
	
	// getter 메소드
		// ---> 클래스 내부에 있는 필드 값을
		//		외부(다른 클래스)에서 가져갈 수 있는 메소드
	
	// setter 메소드
	// ---> 클래스 내부에 있는 필드 값을
	//		외부(다른 클래스)에서 수정할 수 있도록 하는 메소드
	
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	//Regular Employee (생성자)
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);
		this.bonus = bonus;
	}
	
	//getMoneyPay 
	public double getMoneyPay() {
		return (double) (pay + bonus) / 12;
		
	}

}
