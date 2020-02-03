import java.util.Scanner;

class ArrayCar {
	public int speed;
	public int gear;
	public String color;
	
	public ArrayCar() {
		speed = 0;
		gear = 1;
		color = "red";
	}
	public void speedUp() {
		speed +=10;
	}
	public String toString() {
		return "속도: "+speed+", 기어: "+gear+", 색상: "+color;
	}
}
public class ArrayCarTest {
	
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		ArrayCar[] cars = new ArrayCar[NUM_CARS];
		for(int i=0; i< cars.length; i++) {
			cars[i] = new ArrayCar();
		}
		for(int i=0; i< cars.length; i++) {
			cars[i].speedUp();
		}
		for(int i=0; i< cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
