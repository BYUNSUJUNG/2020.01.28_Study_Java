import java.util.Scanner;

class Subject3 { // Ŭ����

	int korScore, mathScore, engScore; // ����, ����, ���� �ʵ�
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
		System.out.println("����: "+korScore+", ����: "+mathScore+", ����: "+engScore);
		System.out.println("����: "+all);
		System.out.println("����: "+avg);
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
			System.out.print("���� ������ �Է��ϼ���: ");
			korScore = scan.nextInt();
			sub[i].setKorScore(korScore);
			
			System.out.print("���� ������ �Է��ϼ���: ");
			mathScore = scan.nextInt();
			sub[i].setMathScore(mathScore);
			
			System.out.print("���� ������ �Է��ϼ���: ");
			engScore = scan.nextInt();
			sub[i].setEngScore(engScore);
			
			sub[i].all();
			sub[i].avg();
			
			sub[i].print();
		}
			
		
		
		
	}

}

		