package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int num1=0, num2;
		
		
		System.out.println("�ϳ��� �����Ͻÿ�: ����(0), ����(1), ��(2), ����(3):");
		num1 = scan.nextInt();
		if(num1==0)
			System.out.println("���: ����");
		else if(num1==1)
			System.out.println("���: ����");
		else if(num1==2)
			System.out.println("���: ��");
		else if(num1==3) {
			// �ý��� ����
			System.exit(0);
		}
		
		num2 = r.nextInt(3);
		if(num2==0)
			System.out.println("��ǻ��: ����");
		else if(num2==1)
			System.out.println("��ǻ��: ����");
		else
			System.out.println("��ǻ��: ��");
		
		if(num1==0) {
			if(num2==1)
				System.out.println("��ǻ�� ��");
			else if(num2==2)
				System.out.println("��� ��");
			else
				System.out.println("���");
		} else if(num1==1) {
			if(num2==0)
				System.out.println("��� ��");
			else if(num2==2)
				System.out.println("��ǻ�� ��");
			else
				System.out.println("���");
		} else { // num1==2 �Ǵ� �� �̿��� ����
			if(num2==0)
				System.out.println("��ǻ�� ��");
			else if(num2==1)
				System.out.println("��� ��");
			else
				System.out.println("���");
		}
		
	} 
}
