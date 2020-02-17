import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

// �����ʸ� ���������� Ŭ������ �ۼ�
// ActionListener �������̽� ����

// ��ư�� ������ ��ư �ȿ� �ؽ�Ʈ�� �ٲ�
class MyListener implements ActionListener { 
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("��ħ�� ��ư�� ���������ϴ�");
	}
}

class MyFrame24 extends JFrame {
	private JButton button;
	
	public MyFrame24() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		this.setLayout(new FlowLayout());
		button = new JButton("��ư�� �����ÿ�");
		button.addActionListener(new MyListener()); // ��ư�� �̺�Ʈ ������ ���
		this.add(button);
		this.setVisible(true);
	}
}

public class ActionEventTest {
	public static void main(String[] args) {
		MyFrame24 t = new MyFrame24();

	}

}
