package Question2;

public class TV {
	
	public String manuFac;
	public int year;
	public int inch;
	

	public TV(String manuFac, int year, int inch) {
		this.manuFac=manuFac;
		this.year = year;
		this.inch = inch;
	}

	public String getManuFac() {
		return manuFac;
	}

	public void setManuFac(String manuFac) {
		this.manuFac = manuFac;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}


	public void show() {
		System.out.println(manuFac + "에서 만든" + year + "년형" + inch + "인치 TV");
	}

	
	
	
}
