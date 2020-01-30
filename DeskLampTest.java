class DeskLamp {
private boolean isOn;
	
	public void turnOn() {
		isOn=true;
		System.out.println("ÄÑÁü");
	}
	public void turnOff() {
		isOn=false;
		System.out.println("²¨Áü");
	}
	
	public String toString() {
		return "ÇöÀç »óÅÂ´Â "+(isOn == true ?"ÄÑÁü":"²¨Áü");
		
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
