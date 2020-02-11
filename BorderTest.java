import java.awt.BorderLayout;
import javax.swing.*;

class MyFrame8 extends JFrame {
	public MyFrame8() {
		
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 배치 관리자를 BorderLayout로 지정
		// 사실 프레임은 default값이 BorderLayout이다.
		setLayout(new BorderLayout());
		
		// 버튼 생성하여 추가
		add(new JButton("center"),BorderLayout.CENTER);
		add(new JButton("Line Start"),BorderLayout.LINE_START);
		add(new JButton("Line End"),BorderLayout.LINE_END);
		add(new JButton("Page Start"),BorderLayout.PAGE_START);
		add(new JButton("Page End"),BorderLayout.PAGE_END);
		
		pack(); // 사이즈 자동 조정
		setVisible(true);
	}
}

public class BorderTest {
	public static void main(String[] args) {
		MyFrame8 f = new MyFrame8();

	}

}
