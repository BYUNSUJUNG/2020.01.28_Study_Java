import java.awt.*;

import javax.swing.*;

class MyPanel20 extends JPanel {
	Font f1, f2, f3, f4, f5;
	
	public MyPanel20() {
		f1 = new Font("Serif", Font.PLAIN, 20);
		f2 = new Font("San Serif", Font.BOLD, 20);
		f3 = new Font("Monosapced", Font.ITALIC, 20);
		f4 = new Font("Dialog", Font.BOLD|Font.ITALIC, 20);
		f5 = new Font("DialogInput", Font.BOLD,20);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(f1);
		g.drawString("PLAIN", 10, 50);
		g.setFont(f2);
		g.drawString("BOLD", 10, 70);
		g.setFont(f3);
		g.drawString("ITALIC", 10, 90);
		g.setFont(f4);
		g.drawString("BOLD+ITALIC", 10, 110);
		g.setFont(f5);
		g.drawString("BOLD", 10, 130);
	}
}



public class FontTest extends JFrame {
	
	public FontTest() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Font Test");
		JPanel panel = new MyPanel20();
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		FontTest s = new FontTest();
		
	}

}
