
class Car2 {
	private int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("���� ���� ȣ��");
	}
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("t�ü� ���� ȣ��");
	}


}

public class CarTest2 {

	public static void main(String[] args) {
		Car2 myCar = new Car2(); 
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
	}

}
