package swing;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxTest extends JPanel implements ItemListener {
	JCheckBox[] buttons = new JCheckBox[3];
	String[] fruits = { "apple", "grape", "orange" };
	JLabel[] pictureLabel = new JLabel[3]; // 문자 
	ImageIcon[] icon = new ImageIcon[3]; // 이미지 

	public CheckBoxTest() {

		super(new GridLayout(0, 4));

		// 체크 박스 생성
		for (int i = 0; i < 3; i++) {
			buttons[i] = new JCheckBox(fruits[i]); // 체크 박스
			buttons[i].addItemListener(this); // 체크박스 아이템리스너 등록
			pictureLabel[i] = new JLabel(fruits[i] + ".gif"); // 문자 
			icon[i] = new ImageIcon(fruits[i] + ".gif"); // 이미지 

		}

		// 체크박스를 하나의 컬럼으로 묶음
		JPanel checkPanel = new JPanel(new GridLayout(0, 1));
		for (int i = 0; i < 3; i++)
			checkPanel.add(buttons[i]);

		// 프레임에 차례대로 삽입
		// GridLayout(0, 4) 
		add(checkPanel);
		add(pictureLabel[0]);
		add(pictureLabel[1]);
		add(pictureLabel[2]);
	}

	/** 체크 박스의 아이템 이벤트를 처리한다. */
	public void itemStateChanged(ItemEvent e) {

		ImageIcon image = null;

		Object source = e.getItemSelectable();
		for (int i = 0; i < 3; i++) {
			if (source == buttons[i]) {
				if (e.getStateChange() == ItemEvent.DESELECTED) // 체크되지 않았을 때
					pictureLabel[i].setIcon(null);
				else // 체크되었을 때
					pictureLabel[i].setIcon(icon[i]); // 이미지 아이콘 객체 설정
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
