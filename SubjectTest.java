

class Subject { // 클래스

	int korScore, mathScore, engScore; // 국어, 영어, 수학 필드
	
	public void print() {
		System.out.println("국어: "+korScore+", 수학: "+mathScore+", 영어: "+engScore);
		System.out.println("총점: "+(korScore + mathScore + engScore));
		System.out.println("평점: "+(korScore + mathScore + engScore)/3);

	}
	
}

public class SubjectTest {

	public static void main(String[] args) {

		Subject sub = new Subject(); // 객체
		sub.korScore=50;
		sub.mathScore=60;
		sub.engScore=70;
		sub.print();
		
		
	}

}

		