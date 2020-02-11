import java.awt.FlowLayout;
import javax.swing.*;

class MyFrame7 extends JFrame {
	public MyFrame7() {
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		
		// �г� ����, ��ġ �����ڸ� FlowLayout�� ����
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// �гο� ��ư �����Ͽ� �߰�
		panel.add(new JButton("button1"));
		panel.add(new JButton("button2"));
		panel.add(new JButton("button3"));
		panel.add(new JButton("b4"));
		panel.add(new JButton("button5"));
		add(panel);
		
		pack(); // ������ �ڵ� ����
		setVisible(true);
	}
}

public class FlowTest {
	public static void main(String[] args) {
		MyFrame7 f = new MyFrame7();

	}

}
