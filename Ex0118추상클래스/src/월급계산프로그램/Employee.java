package 월급계산프로그램;

public abstract class Employee {

	//접근제한자
	// private << default(package) << protected << public
	
	//사번
	protected String empno;
	//이름
	protected String name;
	//연봉
	protected int pay;
	
	
	public abstract int getMoneyPay();

	//print
	public String print() {
		return empno + ":" + name + ":" + pay;
	}

	public Employee (String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}










}
