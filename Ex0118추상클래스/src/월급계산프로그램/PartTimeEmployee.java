package 월급계산프로그램;

public class PartTimeEmployee extends Employee {

	private int workDay;
	
	
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
	public int getWorkDay() {
		return workDay;
	}
	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno,name,pay);
		this.workDay = workDay;
	}
	
	//getMoneyPay 
	public int getMoneyPay() {
		return pay * workDay;
		
	}
	
}
