

class Subject2 { // Ŭ����

	int korScore, mathScore, engScore; // ����, ����, ���� �ʵ�
	int all, avg;
	
	public Subject2(int korScore,int mathScore,int engScore) {
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}
	
	public void all() {
		all = korScore + mathScore + engScore;
	}
	public void avg() {
		avg = (korScore + mathScore + engScore)/3;
	}
	

	public void print() {
		System.out.println("=====================");
		System.out.println("����: "+korScore+", ����: "+mathScore+", ����: "+engScore);
		System.out.println("����: "+all);
		System.out.println("����: "+avg);

	}
	
}

public class SubjectTest2 {

	public static void main(String[] args) {

		Subject2 sub = new Subject2(60,50,70);
		sub.all();
		sub.avg();
		sub.print();
		
		Subject2 sub2 = new Subject2(70,50,90);
		sub2.all();
		sub2.avg();
		sub2.print();
		
		Subject2 sub3 = new Subject2(30,20,10);
		sub3.all();
		sub3.avg();
		sub3.print();

	}

}

		