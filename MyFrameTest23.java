import java.awt.*;
import javax.swing.*;

class MyPanel23 extends JPanel {
	Font f1;
	public MyPanel23() {
		f1 = new Font("Serif", Font.PLAIN, 15);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.fillOval(50, 35, 100, 100);
		

		g.setColor(Color.BLACK);
		g.setFont(f1);
		g.drawString("홍길동", 200, 60);
		g.drawString("프로젝트 매니저", 200, 80);
		g.drawString("자바주식회사", 200, 100);
	
	}
}

public class MyFrameTest23 extends JFrame {
	public MyFrameTest23() {
		
		setSize(400, 200); // 프레임 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("명함만들기");
		setVisible(true);
		add(new MyPanel23()); // MyPanel17를 프레임에 붙인다
		
	}
	public static void main(String[] args) {
		
		MyFrameTest23 f = new MyFrameTest23();
		 
	}

}
