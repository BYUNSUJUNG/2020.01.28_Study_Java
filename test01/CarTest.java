package test01;

class Car { // Ŭ����
	String color; // �ʵ�
	int speed;
	int gear;
	void print() { // �޼ҵ�
		System.out.println("color: "+color);
		System.out.println("speed: "+speed);
		System.out.println("gear: "+gear);
		System.out.println("=======================");
	}

}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car(); // ��ü, ��ü���� �����̴�. ��������: �޸��Ҵ��
		myCar.color = "red";
		myCar.speed = 40;
		myCar.gear = 2;
		myCar.print();
		
		Car yourCar = new Car(); // ��ü
		yourCar.color = "blue";
		yourCar.speed = 80;
		yourCar.gear = 1;
		yourCar.print();
	}
}
