import java.awt.*;
import javax.swing.*;

class MyFrame10 extends JFrame {
	public MyFrame10() {
		
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		// 배치 관리자를 BoxLayout로 지정
		// BoxLayout.Y_AXIS: y축을 기준으로 정렬
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		makeButton(panel,"Button1");
		makeButton(panel,"Button2");
		makeButton(panel,"Button3");
		makeButton(panel,"B4");
		makeButton(panel,"Button5");
		
		add(panel);
		pack(); // 사이즈 자동 조정
		setVisible(true);
	}
	private void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT); // x축 중앙정렬
		panel.add(button);
	}
}

public class BoxTest {
	public static void main(String[] args) {
		MyFrame10 f = new MyFrame10();

	}

}
