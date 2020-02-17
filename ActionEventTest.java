import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

// 리스너를 독립적으로 클래스로 작성
// ActionListener 인터페이스 구현

// 버튼을 누르면 버튼 안에 텍스트가 바뀜
class MyListener implements ActionListener { 
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("마침내 버튼이 눌려졌습니다");
	}
}

class MyFrame24 extends JFrame {
	private JButton button;
	
	public MyFrame24() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 누르시오");
		button.addActionListener(new MyListener()); // 버튼에 이벤트 리스터 등록
		this.add(button);
		this.setVisible(true);
	}
}

public class ActionEventTest {
	public static void main(String[] args) {
		MyFrame24 t = new MyFrame24();

	}

}
