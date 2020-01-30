
class Car2 {
	private int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("t시수 버전 호출");
	}


}

public class CarTest2 {

	public static void main(String[] args) {
		Car2 myCar = new Car2(); 
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
	}

}
