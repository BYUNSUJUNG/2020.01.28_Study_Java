import java.util.Scanner;

public class WhileMenu {

	public static void main(String[] args) {
		/*
		 * 1 �л� ����ó��, 3��
		 * 2 �������ϱ�, ���Ǵ� �簢��
		 * 3 �����, 1~5 ������� �����Ͽ� ���
		 * 4 �����Դϴ�, System.exit(0); 
		 * 4���� �Էµ� ������ �ݺ�*/
		
		int menuNum = 0;
		int korScore, mathScore, engScore;
		int allScore, avgScore;
		
		int figureNum;
		int r, w, h;
		
		int starNum;
		
		

		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. �л� ���� ó��(3��)");
		System.out.println("2. �������ϱ�");
		System.out.println("3. �����");
		System.out.println("4. ����");
		System.out.print("1~4�� ������ ���� �Է��ϼ���: ");
		menuNum = scan.nextInt();
		
		System.out.println("===============================");
		
		while(true) {
			if(menuNum==1) {
				System.out.println("1. �л� ���� ó��(3��)");
				for(int i=1; i<4; i++) {
					System.out.println("===============================");
					System.out.println(i+"��°  �л�");
					System.out.print("������Է�: ");
					korScore = scan.nextInt();
					System.out.print("���м����Է�: ");
					mathScore = scan.nextInt();
					System.out.print("������Է�: ");
					engScore = scan.nextInt();
					
					allScore = korScore + mathScore + engScore;
					avgScore = allScore/3;
					
					
					System.out.println("===============================");
					System.out.println(i+"��° �л��� ����");
					System.out.println("����: "+korScore+",����: "+mathScore+",����: "+engScore);
					System.out.println("����: "+allScore+",����: "+avgScore);
					
					if(avgScore>80) {
						System.out.println("A���");
					} else if(avgScore>60) {
						System.out.println("B���");
					} else {
						System.out.println("C���");
					}	
				}
			}
				
			else if(menuNum==2) {
				System.out.println("2. �������ϱ�");
				System.out.print("(1) �� ");
				System.out.println("(2) �簢��");
				System.out.print("����: ");
				figureNum = scan.nextInt();
				
				System.out.println("=========================");
				switch(figureNum) {
					case 1 :
						System.out.println("���� ���� ���ϱ�");
						System.out.print("�������� �Է����ּ���: ");
						r = scan.nextInt();
						System.out.println("���� ������"+r*r*3.14);
						break;
						
					case 2 : 
						System.out.println("�簢���� ���� ���ϱ�");
						System.out.print("���α��̸� �Է����ּ���: ");
						w = scan.nextInt();
						System.out.print("���α��̸� �Է����ּ���: ");
						h = scan.nextInt();
						System.out.println("�簢���� ������ "+w*h);
						break;
				}
			}
				
			else if(menuNum==3) {
				System.out.println("3. �����");
				System.out.print("1~5 ������ ���ڸ� �Է����ּ���");
				starNum = scan.nextInt();
	
				switch(starNum) {
					case 1 :
						for(int i=0; i<5; i++) {
							for(int j=0; j<5; j++) {
								System.out.print("*");
							}
						}
						break;
					case 2 :
						for(int i=0; i<5; i++) {
							for(int j=0; j<i; j++) {
								System.out.print("*");
							}
						}
						break;
					case 3 :
						for(int i=0; i<5; i++) {
							for(int j=0; j<5-i; j++) {
								System.out.print("*");
							}
						}
						break;
					case 4 :
						for(int i=0; i<5; i++) {
							for(int j=0; j<5-i; j++) {
								System.out.print(" ");
							}
							for(int j=0; j<i; j++) {
								System.out.print("*");
							}
						}
						break;
					case 5 :
						for(int i=0; i<5; i++) {
							for(int j=0; j<i; j++) {
								System.out.print("*");
							}
							for(int j=0; j<5-i; j++) {
								System.out.print("*");
							}
						}
						break;
				}	
				
			
			}
			else if(menuNum==4) {
				System.out.println("4. ����");
				System.exit(0);
			
			}
		}
		

	}

}
