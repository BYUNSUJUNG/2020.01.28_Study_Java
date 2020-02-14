package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int num1=0, num2;
		
		
		System.out.println("하나를 선택하시오: 가위(0), 바위(1), 보(2), 종료(3):");
		num1 = scan.nextInt();
		if(num1==0)
			System.out.println("당신: 가위");
		else if(num1==1)
			System.out.println("당신: 바위");
		else if(num1==2)
			System.out.println("당신: 보");
		else if(num1==3) {
			// 시스템 종료
			System.exit(0);
		}
		
		num2 = r.nextInt(3);
		if(num2==0)
			System.out.println("컴퓨터: 가위");
		else if(num2==1)
			System.out.println("컴퓨터: 바위");
		else
			System.out.println("컴퓨터: 보");
		
		if(num1==0) {
			if(num2==1)
				System.out.println("컴퓨터 승");
			else if(num2==2)
				System.out.println("당신 승");
			else
				System.out.println("비김");
		} else if(num1==1) {
			if(num2==0)
				System.out.println("당신 승");
			else if(num2==2)
				System.out.println("컴퓨터 승");
			else
				System.out.println("비김");
		} else { // num1==2 또는 그 이외의 숫자
			if(num2==0)
				System.out.println("컴퓨터 승");
			else if(num2==1)
				System.out.println("당신 승");
			else
				System.out.println("비김");
		}
		
	} 
}
