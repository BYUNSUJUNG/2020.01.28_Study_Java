package test01;


class SubjectSetterGetter { // 클래스

	int korScore, mathScore, engScore; // 국어, 영어, 수학 필드

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
}

public class SubjectSetterGetterTest {

	public static void main(String[] args) {

		SubjectSetterGetter sub = new SubjectSetterGetter(); // 객체
		sub.setKorScore(50);
		sub.setMathScore(60);
		sub.setEngScore(70);
		
		System.out.println("국어점수: "+sub.getKorScore());
		System.out.println("수학점수: "+sub.getMathScore());
		System.out.println("영어점수: "+sub.getEngScore());
		
	}

}

		