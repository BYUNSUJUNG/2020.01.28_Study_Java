import javax.swing.*;

class MyFrame6 extends JFrame {

	public MyFrame6() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("�ڹ� ȣ�ڿ� ���� ���� ȯ���մϴ�. �����ϼ��� �Է��ϼ���.");
		JButton b1 = new JButton("1��");
		JButton b2 = new JButton("2��");
		JButton b3 = new JButton("3��");
		JButton b4 = new JButton("4��");
		JButton b5 = new JButton("5��");
	
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
