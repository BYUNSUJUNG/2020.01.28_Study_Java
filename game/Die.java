package game;

import java.util.Random;

public class Die {
	private int value;
	private int num;
	Random r = new Random();
	public Die() {
		value = 1;
	}
	public int roll() {
		num = (r.nextInt(5)+1);
		return num;
	}
	public void setValue(int v) {
		value = v;
	}
	public String toSting() {
		return ("현재 주사위 상태: "+roll());
	}
	public static void main(String[] args) {
		Die d = new Die();
		System.out.println(d.toSting());
	} 
}
