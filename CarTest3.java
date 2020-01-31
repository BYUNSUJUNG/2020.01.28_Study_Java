class Car3 {
	private String color;
	private int speed;
	private int gear;
	
	public Car3(String c, int s, int g) { 
		// 다른 클래스에 객체생성을 위해 호출해야하니 public인거임
		color = c;
		speed = s;
		gear = g;
		
	}
	public Car3() {
		color = "red";
		speed = 0;
		gear = 1;
	}
	public void print() {
		// 필드의 접근제어자가  private라서 해당 클래스내에 출력하는 메소드를 만들어야한다.
		System.out.println("색: "+color+", 속도: "+speed+", 기어: "+gear);
	}
	
}
public class CarTest3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3("blue",100,0);
		Car3 c2 = new Car3();
		c1.print();
		c2.print();
		
		// 필드의 접근제어자가 private라서 불가능
		// System.out.println("색: "+c1.color+", 속도: "+c1.speed+", 기어: "+c1.gear);

	}

}
