

class CarSetterGetter { // Ŭ����
	String color; // �ʵ�
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
		CarSetterGetter myCar = new CarSetterGetter(); // ��ü, ��ü���� �����̴�. ��������: �޸��Ҵ��
		myCar.setColor("red");
		myCar.setSpeed(40);
		myCar.setGear(2);
		
		System.out.println(myCar.getColor());
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.getGear());
		
	
	}
	
}
