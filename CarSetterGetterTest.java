

class CarSetterGetter { // 클래스
	String color; // 필드
	int speed;
	int gear;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

}

public class CarSetterGetterTest {
	public static void main(String[] args) {
		CarSetterGetter myCar = new CarSetterGetter(); // 객체, 객체또한 변수이다. 참조변수: 메모리할당됨
		myCar.setColor("red");
		myCar.setSpeed(40);
		myCar.setGear(2);
		
		System.out.println(myCar.getColor());
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.getGear());
		
	
	}
	
}
