import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

// 리스너 클래스를 내부 클래스로 작성

// 버튼을 누르면 판넬 안에 텍스트가 바뀜
class MyFrame25 extends JFrame {
	// actionPerformed 메소드에서도 사용하기 때문에 멤버변수로 선언
	private JButton button;
	private JLabel label;
	
	public MyFrame25() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new MyListener()); // 버튼에 이벤트 리스터 등록
		
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
	}
	private class MyListener implements ActionListener { //  ActionListener 인터페이스 구현
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("마침내 버튼이 눌려졌습니다");
			}
		}
	}
}

public class ActionEventTest2 {
	public static void main(String[] args) {
		MyFrame25 t = new MyFrame25();

	}

}
