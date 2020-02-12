import java.awt.*;
import javax.swing.*;

class MyPanel18 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.drawLine(100, 100, 200, 100);
		//g.drawPolyline();
		
		g.setColor(Color.ORANGE);
		g.drawRect(200, 100, 100, 100);
		g.fillRect(200, 200, 100, 100);
		
		g.setColor(Color.YELLOW);
		g.draw3DRect(300, 100, 100, 100, true);
		g.fill3DRect(300, 200, 100, 100, true);
		
		g.setColor(Color.GREEN);
		g.drawRoundRect(400, 100, 100, 100, 100, 100);
		g.fillRoundRect(400, 200, 100, 100, 100, 100);
		
		g.setColor(Color.BLUE);
		g.drawOval(500, 100, 100, 100);
		g.fillOval(500, 200, 100, 100);
		
		g.setColor(Color.BLACK);
		g.drawArc(600, 100, 100, 100, 100, 100);
		g.fillArc(600, 200, 100, 100, 100, 100);
		//g.drawPolygon(null);
		
	}
}

public class MyFrameTest18 extends JFrame {
	public MyFrameTest18() {
		
		setSize(1000, 500); // 프레임 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("기초 도형 그리기");
		setVisible(true);
		add(new MyPanel18()); // MyPanel17를 프레임에 붙인다
		
	}
	public static void main(String[] args) {
		
		MyFrameTest18 f = new MyFrameTest18();
		 
	}

}
