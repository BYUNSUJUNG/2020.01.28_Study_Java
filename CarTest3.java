class Car3 {
	private String color;
	private int speed;
	private int gear;
	
	public Car3(String c, int s, int g) { 
		// �ٸ� Ŭ������ ��ü������ ���� ȣ���ؾ��ϴ� public�ΰ���
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
		// �ʵ��� ���������ڰ�  private�� �ش� Ŭ�������� ����ϴ� �޼ҵ带 �������Ѵ�.
		System.out.println("��: "+color+", �ӵ�: "+speed+", ���: "+gear);
	}
	
}
public class CarTest3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3("blue",100,0);
		Car3 c2 = new Car3();
		c1.print();
		c2.print();
		
		// �ʵ��� ���������ڰ� private�� �Ұ���
		// System.out.println("��: "+c1.color+", �ӵ�: "+c1.speed+", ���: "+c1.gear);

	}

}
