package Question3;

public class Player {
	
	//모델명
	private String name;
	//색상
	private String color;
	//전원상태
	private boolean power;
	
	public void powerOnOff(boolean onOff) {
		
	}
	
	public void play() {
		
	}

	public void stop() {
		
	}
	
	public int remove(int number) {
		return number;
		
	}

	public Player(String name, String color, boolean power) {
		this.name = name;
		this.color = color;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	
}
