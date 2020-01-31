class Car4 {
	private String color;
	private int speed;
	private int gear;
	
	private int id;
	private static int numberOfCars = 0;
	
	public Car4(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		id = ++numberOfCars;
	}
	
	// 정적메소드에서는 인스턴스 변수와 인스턴스 메스드는 접근할 수 없다
	public static int getNumberOfCars() {
		return numberOfCars;
	}
}
public class CarTest4 {
	public static void main(String[] args) {
		Car4 c1 = new Car4("blue",100,1);
		Car4 c2 = new Car4("white",0,1);
		int n = Car4.getNumberOfCars(); 
		// 정적메소드 호출을 사용하지않으면
		// 정적 필드를 가져올 수 없다.
		
		System.out.println("지금까지 생성된 자동차 수: "+n);
		

	}

}
