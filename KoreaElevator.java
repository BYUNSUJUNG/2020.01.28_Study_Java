import java.util.Scanner;


/*
 * 2020.1.28 
 * Elevator 알고리즘
 */

/*	최대 층 수, 최소 층 수, 현재 층, 입력받은 층, 호출 층
 *  최대 수용인원은 15명, 현재 인원 수, 탑승 인원 수, 내리는 인원 수
 *  총 엘레베이터 이동 수
 *  =================================================
 *  최대 층 수는 10층, 최소 층 수는 1층
 *  첫번째 사람이 1층에서 이동할 층을 누르는 것이 시작
 *  호출 층은 1~10 사이의 랜덤 값
 *  
 *  엘레베이터는 최대 인원을 초과할 수 없음
 *  탑승 인원 수와 내리는 인원 수는 0~9 사이의 랜덤 값
 *  입력 층 이동 -> 호출 층 이동 -> 입력 층 이동 -> 호출 층 이동 ...
 *  운행 종료 조건: 엘레베이터 이동 총 10회 후 종료
 */


public class KoreaElevator {

	public static void main(String[] args) {
		
		final int MAX_FLOOR = 10; // 최대 층 수
		final int MIN_FLOOR = 1; // 최소 층 수
		int nowFloor = 1; // 현재 층
		int inputFloor = 0; // 입력받은 층
		int callFloor; // 호출 층 
		final int MAX_PEOPLE = 15; // 최대 수용 인원은 15명
		int nowPeople = 0; // 현재 인원 수
		int inputPeople = 0; // 탑승 인원 수
		int outputPeople = 0; // 내리는 인원 수 
		int moveCount = 0; // 총 엘레베이터 이동 수(10회 이동시 운행종료)
		
		Scanner scan = new Scanner(System.in);

		System.out.println("어서오세요. 코리아 엘레베이터입니다.");
		
		// 입력 층 이동(홀수) -> 호출 층 이동 -> 입력 층 이동 -> 호출 층 이동 ...
		// 운행 종료 조건: 엘레베이터 이동 총 10회 후 종료
		
		while(moveCount!=10) {
			System.out.println("===================================");
			moveCount += 1;
			System.out.println("엘레베이터가 "+moveCount+"회 이동했습니다(10번 이동시 운행종료)");
			inputPeople = (int)(Math.random()*10);
			
			if(nowPeople+inputPeople>MAX_PEOPLE) {
				nowPeople=15;
				System.out.println("최대 정원입니다");
				System.out.println(inputPeople+"명이 탑승했습니다.");
			} else if(nowPeople+inputPeople<=MAX_PEOPLE) {
				System.out.println(inputPeople+"명이 탑승했습니다.");
				nowPeople += inputPeople;
			}
					
			
			System.out.println("현재 인원 수: "+nowPeople+"명");

			// 이동 홀수 횟수에서 입력 층으로 이동
			if(moveCount%2==1) {
				System.out.println("------------------------");
				System.out.print("이동할 층 수를 입력해주세요(1~10층): ");
				inputFloor = scan.nextInt();
				
				if(nowFloor > inputFloor) {
					// 현재 층이 입력받은 층보다 높을 때
					while(nowFloor == inputFloor) {
						nowFloor --;
					}
				} else if(nowFloor < inputFloor) {
					// 현재 층이 입력받은 층보다 높을 때
					while(nowFloor == inputFloor) {
						nowFloor ++;
					}
				} else if(nowFloor == inputFloor) {
					System.out.println("현재 층입니다.");
				}
			} else if(moveCount%2==0) {
				// 이동 짝수 횟수에서 호출 층으로 이동
				System.out.println("------------------------");
				System.out.println("엘레베이터가 호출되었습니다.");
				callFloor = (int)(Math.random()*10)+1;
				System.out.println(callFloor+"층으로 이동합니다.");
				
				if(nowFloor > callFloor) {
					// 현재 층이 입력받은 층보다 높을 때
					while(nowFloor == inputFloor) {
						nowFloor --;
					}
				} else if(nowFloor < callFloor) {
					// 현재 층이 입력받은 층보다 높을 때
					while(nowFloor == inputFloor) {
						nowFloor ++;
					}
				} else if(nowFloor == callFloor) {
					System.out.println("현재 층입니다.");
				}
				System.out.println(nowFloor+"층에 도착했습니다");
				
				outputPeople = (int)(Math.random()*10);
				nowPeople += outputPeople;
				System.out.println(outputPeople+"명이 내렸습니다.");
			}
			
		}
		
		
		
		

	}

}
