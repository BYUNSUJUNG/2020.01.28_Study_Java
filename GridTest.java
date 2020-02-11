import java.awt.GridLayout;
import javax.swing.*;

class MyFrame9 extends JFrame {
	public MyFrame9() {
		
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 배치 관리자를 GridLayout으로 지정
		setLayout(new GridLayout(0,3));
		
		// 버튼 생성하여 추가
		add(new JButton("button1"));
		add(new JButton("button2"));
		add(new JButton("button3"));
		add(new JButton("b4"));
		add(new JButton("button5"));
		
		pack(); // 사이즈 자동 조정
		setVisible(true);
	}
}

public class GridTest {
	public static void main(String[] args) {
		MyFrame9 f = new MyFrame9();

	}

}
