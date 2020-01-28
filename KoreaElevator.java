import java.util.Scanner;


/*
 * 2020.1.28 
 * Elevator �˰���
 */

/*	�ִ� �� ��, �ּ� �� ��, ���� ��, �Է¹��� ��, ȣ�� ��
 *  �ִ� �����ο��� 15��, ���� �ο� ��, ž�� �ο� ��, ������ �ο� ��
 *  �� ���������� �̵� ��
 *  =================================================
 *  �ִ� �� ���� 10��, �ּ� �� ���� 1��
 *  ù��° ����� 1������ �̵��� ���� ������ ���� ����
 *  ȣ�� ���� 1~10 ������ ���� ��
 *  
 *  ���������ʹ� �ִ� �ο��� �ʰ��� �� ����
 *  ž�� �ο� ���� ������ �ο� ���� 0~9 ������ ���� ��
 *  �Է� �� �̵� -> ȣ�� �� �̵� -> �Է� �� �̵� -> ȣ�� �� �̵� ...
 *  ���� ���� ����: ���������� �̵� �� 10ȸ �� ����
 */


public class KoreaElevator {

	public static void main(String[] args) {
		
		final int MAX_FLOOR = 10; // �ִ� �� ��
		final int MIN_FLOOR = 1; // �ּ� �� ��
		int nowFloor = 1; // ���� ��
		int inputFloor = 0; // �Է¹��� ��
		int callFloor; // ȣ�� �� 
		final int MAX_PEOPLE = 15; // �ִ� ���� �ο��� 15��
		int nowPeople = 0; // ���� �ο� ��
		int inputPeople = 0; // ž�� �ο� ��
		int outputPeople = 0; // ������ �ο� �� 
		int moveCount = 0; // �� ���������� �̵� ��(10ȸ �̵��� ��������)
		
		Scanner scan = new Scanner(System.in);

		System.out.println("�������. �ڸ��� �����������Դϴ�.");
		
		// �Է� �� �̵�(Ȧ��) -> ȣ�� �� �̵� -> �Է� �� �̵� -> ȣ�� �� �̵� ...
		// ���� ���� ����: ���������� �̵� �� 10ȸ �� ����
		
		while(moveCount!=10) {
			System.out.println("===================================");
			moveCount += 1;
			System.out.println("���������Ͱ� "+moveCount+"ȸ �̵��߽��ϴ�(10�� �̵��� ��������)");
			inputPeople = (int)(Math.random()*10);
			
			if(nowPeople+inputPeople>MAX_PEOPLE) {
				nowPeople=15;
				System.out.println("�ִ� �����Դϴ�");
				System.out.println(inputPeople+"���� ž���߽��ϴ�.");
			} else if(nowPeople+inputPeople<=MAX_PEOPLE) {
				System.out.println(inputPeople+"���� ž���߽��ϴ�.");
				nowPeople += inputPeople;
			}
					
			
			System.out.println("���� �ο� ��: "+nowPeople+"��");

			// �̵� Ȧ�� Ƚ������ �Է� ������ �̵�
			if(moveCount%2==1) {
				System.out.println("------------------------");
				System.out.print("�̵��� �� ���� �Է����ּ���(1~10��): ");
				inputFloor = scan.nextInt();
				
				if(nowFloor > inputFloor) {
					// ���� ���� �Է¹��� ������ ���� ��
					while(nowFloor == inputFloor) {
						nowFloor --;
					}
				} else if(nowFloor < inputFloor) {
					// ���� ���� �Է¹��� ������ ���� ��
					while(nowFloor == inputFloor) {
						nowFloor ++;
					}
				} else if(nowFloor == inputFloor) {
					System.out.println("���� ���Դϴ�.");
				}
			} else if(moveCount%2==0) {
				// �̵� ¦�� Ƚ������ ȣ�� ������ �̵�
				System.out.println("------------------------");
				System.out.println("���������Ͱ� ȣ��Ǿ����ϴ�.");
				callFloor = (int)(Math.random()*10)+1;
				System.out.println(callFloor+"������ �̵��մϴ�.");
				
				if(nowFloor > callFloor) {
					// ���� ���� �Է¹��� ������ ���� ��
					while(nowFloor == inputFloor) {
						nowFloor --;
					}
				} else if(nowFloor < callFloor) {
					// ���� ���� �Է¹��� ������ ���� ��
					while(nowFloor == inputFloor) {
						nowFloor ++;
					}
				} else if(nowFloor == callFloor) {
					System.out.println("���� ���Դϴ�.");
				}
				System.out.println(nowFloor+"���� �����߽��ϴ�");
				
				outputPeople = (int)(Math.random()*10);
				nowPeople += outputPeople;
				System.out.println(outputPeople+"���� ���Ƚ��ϴ�.");
			}
			
		}
		
		
		
		

	}

}
