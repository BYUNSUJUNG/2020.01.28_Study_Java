package swing;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxTest extends JPanel implements ItemListener {
	JCheckBox[] buttons = new JCheckBox[3];
	String[] fruits = { "apple", "grape", "orange" };
	JLabel[] pictureLabel = new JLabel[3]; // ���� 
	ImageIcon[] icon = new ImageIcon[3]; // �̹��� 

	public CheckBoxTest() {

		super(new GridLayout(0, 4));

		// üũ �ڽ� ����
		for (int i = 0; i < 3; i++) {
			buttons[i] = new JCheckBox(fruits[i]); // üũ �ڽ�
			buttons[i].addItemListener(this); // üũ�ڽ� �����۸����� ���
			pictureLabel[i] = new JLabel(fruits[i] + ".gif"); // ���� 
			icon[i] = new ImageIcon(fruits[i] + ".gif"); // �̹��� 

		}

		// üũ�ڽ��� �ϳ��� �÷����� ����
		JPanel checkPanel = new JPanel(new GridLayout(0, 1));
		for (int i = 0; i < 3; i++)
			checkPanel.add(buttons[i]);

		// �����ӿ� ���ʴ�� ����
		// GridLayout(0, 4) 
		add(checkPanel);
		add(pictureLabel[0]);
		add(pictureLabel[1]);
		add(pictureLabel[2]);
	}

	/** üũ �ڽ��� ������ �̺�Ʈ�� ó���Ѵ�. */
	public void itemStateChanged(ItemEvent e) {

		ImageIcon image = null;

		Object source = e.getItemSelectable();
		for (int i = 0; i < 3; i++) {
			if (source == buttons[i]) {
				if (e.getStateChange() == ItemEvent.DESELECTED) // üũ���� �ʾ��� ��
					pictureLabel[i].setIcon(null);
				else // üũ�Ǿ��� ��
					pictureLabel[i].setIcon(icon[i]); // �̹��� ������ ��ü ����
			}
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponent newContentPane = new CheckBoxTest();
		newContentPane.setOpaque(true); 
		
		frame.setContentPane(newContentPane);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}
}
