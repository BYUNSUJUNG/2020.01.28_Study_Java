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
	
	// �����޼ҵ忡���� �ν��Ͻ� ������ �ν��Ͻ� �޽���� ������ �� ����
	public static int getNumberOfCars() {
		return numberOfCars;
	}
}
public class CarTest4 {
	public static void main(String[] args) {
		Car4 c1 = new Car4("blue",100,1);
		Car4 c2 = new Car4("white",0,1);
		int n = Car4.getNumberOfCars(); 
		// �����޼ҵ� ȣ���� �������������
		// ���� �ʵ带 ������ �� ����.
		
		System.out.println("���ݱ��� ������ �ڵ��� ��: "+n);
		

	}

}
