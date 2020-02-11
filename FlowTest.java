import java.awt.FlowLayout;
import javax.swing.*;

class MyFrame7 extends JFrame {
	public MyFrame7() {
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		
		// 패널 생성, 배치 관리자를 FlowLayout로 지정
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// 패널에 버튼 생성하여 추가
		panel.add(new JButton("button1"));
		panel.add(new JButton("button2"));
		panel.add(new JButton("button3"));
		panel.add(new JButton("b4"));
		panel.add(new JButton("button5"));
		add(panel);
		
		pack(); // 사이즈 자동 조정
		setVisible(true);
	}
}

public class FlowTest {
	public static void main(String[] args) {
		MyFrame7 f = new MyFrame7();

	}

}
