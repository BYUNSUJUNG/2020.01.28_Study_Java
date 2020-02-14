import java.awt.*;
import javax.swing.*;

class MyPanel22 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		

		g.drawLine(100, 100, 200, 50); // 왼쪽 지붕
		g.drawLine(200, 50, 350, 100); // 오른쪽 지붕
		g.drawRect(100, 100, 250, 250); // 집 몸체
		g.drawRect(120, 120, 30, 30); // 왼쪽 상단에 작은 창문
		g.drawRect(250, 250, 50, 100); // 문
		
		
	}
}

public class MyFrameTest22 extends JFrame {
	public MyFrameTest22() {
		
		setSize(500, 500); // 프레임 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("집 그리기");
		setVisible(true);
		add(new MyPanel22()); // MyPanel17를 프레임에 붙인다
		
	}
	public static void main(String[] args) {
		
		MyFrameTest22 f = new MyFrameTest22();
		 
	}

}
