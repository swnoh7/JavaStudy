package 월급계산프로그램;

public class TempEmployee extends Employee {

	
	//getter setter
	
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
	
	public TempEmployee(String empno, String name, int pay) {
		super(empno,name,pay);
	}
	
	//getMoneyPay 
	public int getMoneyPay() {
		return pay / 12;
		
	}
	
	
}
