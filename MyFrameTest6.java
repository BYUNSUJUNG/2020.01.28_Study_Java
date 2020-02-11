import javax.swing.*;

class MyFrame6 extends JFrame {

	public MyFrame6() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
		JButton b1 = new JButton("1박");
		JButton b2 = new JButton("2박");
		JButton b3 = new JButton("3박");
		JButton b4 = new JButton("4박");
		JButton b5 = new JButton("5박");
	
		panel.add(label);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		
		
		add(panel);
		setVisible(true);
	}
}
public class MyFrameTest6 {

	public static void main(String[] args) {
		MyFrame6 f = new MyFrame6();

	}

}
