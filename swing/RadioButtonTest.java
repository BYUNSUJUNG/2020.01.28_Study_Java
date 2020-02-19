package swing;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.awt.*;

class MyFrame extends JFrame implements ActionListener {

	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;

	public MyFrame() {
		setTitle("���� ��ư �׽�Ʈ");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ������ ����ϴ� topPanel ���� 
		topPanel = new JPanel();
		
		JLabel label = new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH); // ������ ����1

		// ���� ��ư�� �����ϴ� sizePanel ����
		sizePanel = new JPanel();
		
		// ���� ��ư ����
		small = new JRadioButton("Small Size");
		//small = new JRadioButton("Small Size", true); // �ʱ� ���� ���� true:üũ
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");

		// ���� ��ư�� ��ư �׷��� �ʿ���
		// ��ư �׷� ����
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		small.addActionListener(this); //�̺�Ʈ
		medium.addActionListener(this);
		large.addActionListener(this);
		
		// ��� �����
		Border border = BorderFactory.createTitledBorder("ũ��");
		sizePanel.setBorder(border);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		add(sizePanel, BorderLayout.CENTER); // ������ ����2

		// ���¸� ����ϴ� resultPanel ����
		resultPanel = new JPanel();
		text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH); // ������ ����3
		
		setVisible(true);
	}

	// ���� ��ư ���� ��� ���
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == small) {
			text.setText("Small ũ�Ⱑ ���õǾ����ϴ�.");
		}
		if (e.getSource() == medium) {
			text.setText("Medium ũ�Ⱑ ���õǾ����ϴ�.");
		}
		if (e.getSource() == large) {
			text.setText("Large ũ�Ⱑ ���õǾ����ϴ�.");
		}
	}
}

public class RadioButtonTest extends JFrame {
	public static void main(String[] args) {
		new MyFrame();
	}

}
