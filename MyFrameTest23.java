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
		g.drawString("ȫ�浿", 200, 60);
		g.drawString("������Ʈ �Ŵ���", 200, 80);
		g.drawString("�ڹ��ֽ�ȸ��", 200, 100);
	
	}
}

public class MyFrameTest23 extends JFrame {
	public MyFrameTest23() {
		
		setSize(400, 200); // ������ ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("���Ը����");
		setVisible(true);
		add(new MyPanel23()); // MyPanel17�� �����ӿ� ���δ�
		
	}
	public static void main(String[] args) {
		
		MyFrameTest23 f = new MyFrameTest23();
		 
	}

}
