import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame12 extends JFrame {
	
	JButton b1;
	private JButton b2, b3;
	
	public MyFrame12() {
		
		setTitle("setBoundsTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		
		JPanel  p = new JPanel();
		p.setLayout(null);
		
		b1 = new JButton("button1");
		p.add(b1);
		b2 = new JButton("button2");
		p.add(b2);
		b3 = new JButton("button3");
		p.add(b3);
		
		// 절대 위치로 배치하기
		b1.setBounds(20,5,95,30);
		b2.setBounds(55,45,105,70);
		b3.setBounds(180,15,105,90);
		add(p);
		setVisible(true);
	}
}

public class AbsoluteTest {
	public static void main(String[] args) {
		MyFrame12 f = new MyFrame12();
	}
}
