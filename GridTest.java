import java.awt.GridLayout;
import javax.swing.*;

class MyFrame9 extends JFrame {
	public MyFrame9() {
		
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��ġ �����ڸ� GridLayout���� ����
		setLayout(new GridLayout(0,3));
		
		// ��ư �����Ͽ� �߰�
		add(new JButton("button1"));
		add(new JButton("button2"));
		add(new JButton("button3"));
		add(new JButton("b4"));
		add(new JButton("button5"));
		
		pack(); // ������ �ڵ� ����
		setVisible(true);
	}
}

public class GridTest {
	public static void main(String[] args) {
		MyFrame9 f = new MyFrame9();

	}

}
