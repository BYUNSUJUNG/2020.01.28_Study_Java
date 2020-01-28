import java.util.Scanner;

public class WhileMenu {

	public static void main(String[] args) {
		/*
		 * 1 학생 성적처리, 3명
		 * 2 면적구하기, 원또는 사각형
		 * 3 별찍기, 1~5 별찍기중 선택하여 찍기
		 * 4 종료입니다, System.exit(0); 
		 * 4번이 입력될 때까지 반복*/
		
		int menuNum = 0;
		int korScore, mathScore, engScore;
		int allScore, avgScore;
		
		int figureNum;
		int r, w, h;
		
		int starNum;
		
		

		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 학생 성적 처리(3명)");
		System.out.println("2. 면적구하기");
		System.out.println("3. 별찍기");
		System.out.println("4. 종료");
		System.out.print("1~4번 사이의 수를 입력하세요: ");
		menuNum = scan.nextInt();
		
		System.out.println("===============================");
		
		while(true) {
			if(menuNum==1) {
				System.out.println("1. 학생 성적 처리(3명)");
				for(int i=1; i<4; i++) {
					System.out.println("===============================");
					System.out.println(i+"번째  학생");
					System.out.print("국어성적입력: ");
					korScore = scan.nextInt();
					System.out.print("수학성적입력: ");
					mathScore = scan.nextInt();
					System.out.print("영어성적입력: ");
					engScore = scan.nextInt();
					
					allScore = korScore + mathScore + engScore;
					avgScore = allScore/3;
					
					
					System.out.println("===============================");
					System.out.println(i+"번째 학생의 성적");
					System.out.println("국어: "+korScore+",수학: "+mathScore+",영어: "+engScore);
					System.out.println("총점: "+allScore+",평점: "+avgScore);
					
					if(avgScore>80) {
						System.out.println("A등급");
					} else if(avgScore>60) {
						System.out.println("B등급");
					} else {
						System.out.println("C등급");
					}	
				}
			}
				
			else if(menuNum==2) {
				System.out.println("2. 면적구하기");
				System.out.print("(1) 원 ");
				System.out.println("(2) 사각형");
				System.out.print("선택: ");
				figureNum = scan.nextInt();
				
				System.out.println("=========================");
				switch(figureNum) {
					case 1 :
						System.out.println("원의 면적 구하기");
						System.out.print("반지름을 입력해주세요: ");
						r = scan.nextInt();
						System.out.println("원의 면적은"+r*r*3.14);
						break;
						
					case 2 : 
						System.out.println("사각형의 면적 구하기");
						System.out.print("가로길이를 입력해주세요: ");
						w = scan.nextInt();
						System.out.print("세로길이를 입력해주세요: ");
						h = scan.nextInt();
						System.out.println("사각형의 면적은 "+w*h);
						break;
				}
			}
				
			else if(menuNum==3) {
				System.out.println("3. 별찍기");
				System.out.print("1~5 사이의 숫자를 입력해주세요");
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
				System.out.println("4. 종료");
				System.exit(0);
			
			}
		}
		

	}

}
