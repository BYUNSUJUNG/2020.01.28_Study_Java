

class Subject { // Ŭ����

	int korScore, mathScore, engScore; // ����, ����, ���� �ʵ�
	
	public void print() {
		System.out.println("����: "+korScore+", ����: "+mathScore+", ����: "+engScore);
		System.out.println("����: "+(korScore + mathScore + engScore));
		System.out.println("����: "+(korScore + mathScore + engScore)/3);

	}
	
}

public class SubjectTest {

	public static void main(String[] args) {

		Subject sub = new Subject(); // ��ü
		sub.korScore=50;
		sub.mathScore=60;
		sub.engScore=70;
		sub.print();
		
		
	}

}

		