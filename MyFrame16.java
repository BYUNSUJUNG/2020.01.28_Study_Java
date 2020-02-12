import java.awt.Graphics;
import javax.swing.*;


class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("æ»≥Á«œººø‰", 10, 10); // (txt, start_x, start_y)
		g.drawLine(10, 20, 110, 20); // (start_x, start_y, end_x, end_y)
		g.drawRect(10, 30, 100, 100); // (start_x, start_y, width, height)
	}
}

public class MyFrame16 extends JFrame {

	public MyFrame16() {
		
		setTitle("MyFrame");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel p = new MyPanel();
		setVisible(true);
		add(p);
	}
	public static void main(String[] args) {
		 MyFrame16 f = new MyFrame16();
	}

}
