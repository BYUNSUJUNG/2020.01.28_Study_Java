import java.awt.*;
import javax.swing.*;

class MyFrame15 extends JFrame {

	public MyFrame15() {
		// p�� p1, p2, p3�� ���� �ǳ�
		// p1�� �ؽ�Ʈ �ʵ带 ���� �ǳ�
		// p2�� ��ư c�� ���� �ǳ�
		// p3�� 1~9�� ���ڿ� ��Ģ ���� ��ȣ�� ���� �ǳ�
		
		JPanel p, p1, p2, p3; // �ǳ� 4��
		JTextField tf; // �ؽ�Ʈ �ʵ�
		JButton[] b = new JButton[17]; // 17���� ��ư �迭 ����
		
		p = new JPanel(); // p �ǳ� ����
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS)); // p �ǳ��� ���̾ƿ��� BoxLayout, Y_AXIS�� Y���� �������� �߾�����
		p1 = new JPanel(); // p1 �ǳ� ���� 
		FlowLayout layout = new FlowLayout(); // FlowLayout ����
		layout.setAlignment(FlowLayout.LEFT); // FlowLayout�� ���ʿ� ����
		layout.setVgap(0); // ���� ����
		p1.setLayout(layout); // p1 �ǳ��� ���̾ƿ��� FlowLayout
		
		p2 = new JPanel(); // p2 �ǳ� ����
		p2.setLayout(layout); // p2 �ǳ��� ���̾ƿ��� FlowLayout
		
		p3 = new JPanel(new GridLayout(0,4)); // p3 �ǳ��� ���̾ƿ��� GridLayout, rows:0, cols:4
		
		tf = new JTextField(30); // ���� 30�� �Է°����� JTextField
		p1.add(tf); // �ؽ�Ʈ �ʵ带 p1�� ���δ�
		
		b[0] = new JButton("C");
		b[1] = new JButton("7");
		b[2] = new JButton("8");
		b[3] = new JButton("9");
		b[4] = new JButton("/");
		b[5] = new JButton("4");
		b[6] = new JButton("5");
		b[7] = new JButton("6");
		b[8] = new JButton("*");
		b[9] = new JButton("1");
		b[10] = new JButton("2");
		b[11] = new JButton("3");
		b[12] = new JButton("-");
		b[13] = new JButton("0");
		b[14] = new JButton("+/-");
		b[15] = new JButton("=");
		b[16] = new JButton("+");
		
		p2.add(b[0]);
		for(int i=1; i<17; i++) {
			p3.add(b[i]);
		}
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}
public class MyFrameTest15 {

	public static void main(String[] args) {
		new MyFrame15();

	}

}
