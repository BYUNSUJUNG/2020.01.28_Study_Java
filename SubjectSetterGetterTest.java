package test01;


class SubjectSetterGetter { // Ŭ����

	int korScore, mathScore, engScore; // ����, ����, ���� �ʵ�

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

		SubjectSetterGetter sub = new SubjectSetterGetter(); // ��ü
		sub.setKorScore(50);
		sub.setMathScore(60);
		sub.setEngScore(70);
		
		System.out.println("��������: "+sub.getKorScore());
		System.out.println("��������: "+sub.getMathScore());
		System.out.println("��������: "+sub.getEngScore());
		
	}

}

		