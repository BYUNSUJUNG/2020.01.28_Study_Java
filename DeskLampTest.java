class DeskLamp {
private boolean isOn;
	
	public void turnOn() {
		isOn=true;
		System.out.println("����");
	}
	public void turnOff() {
		isOn=false;
		System.out.println("����");
	}
	
	public String toString() {
		return "���� ���´� "+(isOn == true ?"����":"����");
		
	}

		
 }
public class DeskLampTest {

	public static void main(String[] args) {
		DeskLamp des = new DeskLamp();
		des.turnOn();
		System.out.println(des);
		des.turnOff();
		System.out.println(des);
	}
	
	
}
