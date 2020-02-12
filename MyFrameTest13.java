import java.awt.FlowLayout;

import javax.swing.*;

class MyFrame13 extends JFrame {
	
	JPanel p1;
	public MyFrame13() {
		setSize(300,200);
		setTitle("MyFrame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for(int i = 0; i<10; i++) {
			p1.add(new JButton("Button"+i));
		add(p1);
		setVisible(true);
		}
	}
}
public class MyFrameTest13 {

	public static void main(String[] args) {
		MyFrame13 f = new MyFrame13();

	}

}
