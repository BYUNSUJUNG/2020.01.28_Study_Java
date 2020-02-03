import java.util.Scanner;

class Subject3 { // 클래스

	int korScore, mathScore, engScore; // 국어, 영어, 수학 필드
	int all, avg;
	
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	
	public void all() {
		all = korScore + mathScore + engScore;
	}
	public void avg() {
		avg = (korScore + mathScore + engScore)/3;
	}
	

	public void print() {
		System.out.println("===========================");
		System.out.println("국어: "+korScore+", 수학: "+mathScore+", 영어: "+engScore);
		System.out.println("총점: "+all);
		System.out.println("평점: "+avg);
		System.out.println("===========================");
	}
	
}

public class SubjectTest3 {

	public static void main(String[] args) {
		
		int korScore, mathScore, engScore;
		final int NUM_SUB = 3;
		Subject3[] sub = new Subject3[NUM_SUB];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<sub.length; i++) {
			sub[i] = new Subject3();
		}	
		for(int i=0; i<sub.length; i++) {
			System.out.print("국어 성적을 입력하세요: ");
			korScore = scan.nextInt();
			sub[i].setKorScore(korScore);
			
			System.out.print("수학 성적을 입력하세요: ");
			mathScore = scan.nextInt();
			sub[i].setMathScore(mathScore);
			
			System.out.print("영어 성적을 입력하세요: ");
			engScore = scan.nextInt();
			sub[i].setEngScore(engScore);
			
			sub[i].all();
			sub[i].avg();
			
			sub[i].print();
		}
			
		
		
		
	}

}

		