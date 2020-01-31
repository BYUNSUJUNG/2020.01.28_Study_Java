class Area {
	
	public double circleArea(int r) {
		// 원의 면적 구하기
		return 3.14*r*r;
	}
	public double circleCircumference(int r) {
		// 원의 둘레 구하기
		return 2*3.14*r;
	}
	public int squareArea(int w, int h) {
		// 사각형의 면적 구하기
		return w*h;
	}
	public int squareCircumference(int w, int h) {
		// 사각형의 둘레 구하기
		return 2*(w+h);
	}

	
}
public class AreaTest {

	public static void main(String[] args) {
		Area area = new Area();
		System.out.println("원의 면적: "+area.circleArea(5));
		System.out.println("원의 둘레: "+area.circleCircumference(5));
		System.out.println("사각형의 면적: "+area.squareArea(2,5));
		System.out.println("사각형의 둘레: "+area.squareCircumference(2,5));

	}

}
