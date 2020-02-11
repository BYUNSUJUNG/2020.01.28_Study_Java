import java.awt.*;
import javax.swing.*;

class MyFrame10 extends JFrame {
	public MyFrame10() {
		
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		// ��ġ �����ڸ� BoxLayout�� ����
		// BoxLayout.Y_AXIS: y���� �������� ����
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		makeButton(panel,"Button1");
		makeButton(panel,"Button2");
		makeButton(panel,"Button3");
		makeButton(panel,"B4");
		makeButton(panel,"Button5");
		
		add(panel);
		pack(); // ������ �ڵ� ����
		setVisible(true);
	}
	private void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT); // x�� �߾�����
		panel.add(button);
	}
}

public class BoxTest {
	public static void main(String[] args) {
		MyFrame10 f = new MyFrame10();

	}

}
