import javax.swing.*;

class MyFrame5 extends JFrame {

	public MyFrame5() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEnabled(false);
		
		panel.add(t1);
		panel.add(t2);
		
		add(panel);
		setVisible(true);
	}
}
public class MyFrameTest5 {

	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5();

	}

}
