import java.awt.BorderLayout;
import javax.swing.*;

class MyFrame8 extends JFrame {
	public MyFrame8() {
		
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��ġ �����ڸ� BorderLayout�� ����
		// ��� �������� default���� BorderLayout�̴�.
		setLayout(new BorderLayout());
		
		// ��ư �����Ͽ� �߰�
		add(new JButton("center"),BorderLayout.CENTER);
		add(new JButton("Line Start"),BorderLayout.LINE_START);
		add(new JButton("Line End"),BorderLayout.LINE_END);
		add(new JButton("Page Start"),BorderLayout.PAGE_START);
		add(new JButton("Page End"),BorderLayout.PAGE_END);
		
		pack(); // ������ �ڵ� ����
		setVisible(true);
	}
}

public class BorderTest {
	public static void main(String[] args) {
		MyFrame8 f = new MyFrame8();

	}

}
