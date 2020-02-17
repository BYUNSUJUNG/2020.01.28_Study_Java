import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

// ������ Ŭ������ ���� Ŭ������ �ۼ�

// ��ư�� ������ �ǳ� �ȿ� �ؽ�Ʈ�� �ٲ�
class MyFrame25 extends JFrame {
	// actionPerformed �޼ҵ忡���� ����ϱ� ������ ��������� ����
	private JButton button;
	private JLabel label;
	
	public MyFrame25() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		JPanel panel = new JPanel();
		
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new MyListener()); // ��ư�� �̺�Ʈ ������ ���
		
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
	}
	private class MyListener implements ActionListener { //  ActionListener �������̽� ����
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("��ħ�� ��ư�� ���������ϴ�");
			}
		}
	}
}

public class ActionEventTest2 {
	public static void main(String[] args) {
		MyFrame25 t = new MyFrame25();

	}

}
