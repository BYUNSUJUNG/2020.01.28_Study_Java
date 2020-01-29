package test01;

class Car { // 클래스
	String color; // 필드
	int speed;
	int gear;
	void print() { // 메소드
		System.out.println("color: "+color);
		System.out.println("speed: "+speed);
		System.out.println("gear: "+gear);
		System.out.println("=======================");
	}

}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car(); // 객체, 객체또한 변수이다. 참조변수: 메모리할당됨
		myCar.color = "red";
		myCar.speed = 40;
		myCar.gear = 2;
		myCar.print();
		
		Car yourCar = new Car(); // 객체
		yourCar.color = "blue";
		yourCar.speed = 80;
		yourCar.gear = 1;
		yourCar.print();
	}
}
