class Area {
	
	public double circleArea(int r) {
		// ���� ���� ���ϱ�
		return 3.14*r*r;
	}
	public double circleCircumference(int r) {
		// ���� �ѷ� ���ϱ�
		return 2*3.14*r;
	}
	public int squareArea(int w, int h) {
		// �簢���� ���� ���ϱ�
		return w*h;
	}
	public int squareCircumference(int w, int h) {
		// �簢���� �ѷ� ���ϱ�
		return 2*(w+h);
	}

	
}
public class AreaTest {

	public static void main(String[] args) {
		Area area = new Area();
		System.out.println("���� ����: "+area.circleArea(5));
		System.out.println("���� �ѷ�: "+area.circleCircumference(5));
		System.out.println("�簢���� ����: "+area.squareArea(2,5));
		System.out.println("�簢���� �ѷ�: "+area.squareCircumference(2,5));

	}

}
