import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

class MyFrame14 extends JFrame {
	
	JPanel p = new JPanel(); // �ǳ� ����
	JLabel[] labels = new JLabel[30]; // �󺧷� �迭 
	
	public MyFrame14() {
		p.setLayout(null); // ���̾ƿ� ����
		for(int i=0; i<30; i++) {
			labels[i] = new JLabel(""+i); // 0���� 29���� ���ڸ� ���� ���� ����
			int x = (int)(500*Math.random()); // setLocation�� �̿��  x, y�� ������
			int y = (int)(200*Math.random());
			labels[i].setForeground(Color.MAGENTA); // ��Ʈ ��
			labels[i].setLocation(x, y); // ���� ��ġ
			labels[i].setSize(20,20); // ���� ũ��
			p.add(labels[i]); // �󺧸� �ǳڿ� ���δ�
		}	
		setSize(500,300); // �ǳ��� ������
		add(p); // �ǳ��� �����ӿ� ���δ�
		setVisible(true); // ������
	}
}
public class MyFrameTest14 {

	public static void main(String[] args) {
		MyFrame14 f = new MyFrame14();

	}

}
