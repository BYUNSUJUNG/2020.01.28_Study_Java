import java.awt.*;
import javax.swing.*;

class MyPanel22 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		

		g.drawLine(100, 100, 200, 50); // ���� ����
		g.drawLine(200, 50, 350, 100); // ������ ����
		g.drawRect(100, 100, 250, 250); // �� ��ü
		g.drawRect(120, 120, 30, 30); // ���� ��ܿ� ���� â��
		g.drawRect(250, 250, 50, 100); // ��
		
		
	}
}

public class MyFrameTest22 extends JFrame {
	public MyFrameTest22() {
		
		setSize(500, 500); // ������ ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("�� �׸���");
		setVisible(true);
		add(new MyPanel22()); // MyPanel17�� �����ӿ� ���δ�
		
	}
	public static void main(String[] args) {
		
		MyFrameTest22 f = new MyFrameTest22();
		 
	}

}
