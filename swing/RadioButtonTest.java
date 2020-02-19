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
		setTitle("라디오 버튼 테스트");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 질문을 출력하는 topPanel 생성 
		topPanel = new JPanel();
		
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH); // 프레임 부착1

		// 라디오 버튼을 선택하는 sizePanel 생성
		sizePanel = new JPanel();
		
		// 라디오 버튼 생성
		small = new JRadioButton("Small Size");
		//small = new JRadioButton("Small Size", true); // 초기 상태 설정 true:체크
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");

		// 라디오 버튼은 버튼 그룹이 필요함
		// 버튼 그룹 생성
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		small.addActionListener(this); //이벤트
		medium.addActionListener(this);
		large.addActionListener(this);
		
		// 경계 만들기
		Border border = BorderFactory.createTitledBorder("크기");
		sizePanel.setBorder(border);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		add(sizePanel, BorderLayout.CENTER); // 프레임 부착2

		// 상태를 출력하는 resultPanel 생성
		resultPanel = new JPanel();
		text = new JLabel("크기가 선택되지 않았습니다.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH); // 프레임 부착3
		
		setVisible(true);
	}

	// 라디오 버튼 선택 결과 출력
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == small) {
			text.setText("Small 크기가 선택되었습니다.");
		}
		if (e.getSource() == medium) {
			text.setText("Medium 크기가 선택되었습니다.");
		}
		if (e.getSource() == large) {
			text.setText("Large 크기가 선택되었습니다.");
		}
	}
}

public class RadioButtonTest extends JFrame {
	public static void main(String[] args) {
		new MyFrame();
	}

}
