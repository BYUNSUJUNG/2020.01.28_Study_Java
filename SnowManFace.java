import java.awt.*;
import javax.swing.*;

class MyPanel17 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW); // 노란색으로 지정
		g.fillOval(20, 30, 200, 200); // (start_x, start_y, width, heigth)
		g.setColor(Color.BLACK); // 검정색으로 지정
		
		// (start_x, start_y, width, heigth, startAngle, arcAngle)
		g.drawArc(60, 80, 50, 50, 180, -180); // 왼쪽 눈 
		g.drawArc(150, 80, 50, 50, 180, -180); // 오른쪽 눈
		g.drawArc(70, 130, 100, 70, 180, 180); // 입
	}
}

public class SnowManFace extends JFrame {
	public SnowManFace() {
		
		setSize(280, 300); // 프레임 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("눈사람얼굴");
		setVisible(true);
		add(new MyPanel17()); // MyPanel17를 프레임에 붙인다
		
	}
	public static void main(String[] args) {
		
		SnowManFace f = new SnowManFace();
		 
	}

}
