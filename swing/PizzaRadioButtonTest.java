// p131, topingPanel 안나오니까 수정하기
package swing;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.awt.*;

class MyFrame5 extends JFrame implements ActionListener {

	private JRadioButton combo, potato, bulgogi;
	private JRadioButton pimento, cheese, pepperoni, bacon;
	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, pizzaPanel, toppingPanel, sizePanel, resultPanel;
	private JButton button, backButton;
	private JTextField textField;
	 
	public MyFrame5() {
		setTitle("피자 선택 주문 테스트");
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. topPanel 생성 
		topPanel = new JPanel();
		
		JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다");
		topPanel.add(label);
		add(topPanel, BorderLayout.PAGE_START);

		// 2. pizzaPanel 생성
		pizzaPanel = new JPanel();
		pizzaPanel.setLayout(new BoxLayout(pizzaPanel, BoxLayout.Y_AXIS));
		// 3. topingPanel 생성
		toppingPanel = new JPanel();
		toppingPanel.setLayout(new BoxLayout(toppingPanel, BoxLayout.Y_AXIS));
		// 4. sizePanel 생성
		sizePanel = new JPanel();
		sizePanel.setLayout(new BoxLayout(sizePanel, BoxLayout.Y_AXIS));
		
		// 라디오 버튼 생성
		// 종류 버튼
		combo = new JRadioButton("콤보");
		potato = new JRadioButton("포테이토");
		bulgogi = new JRadioButton("불고기");
		// 추가토핑 버튼
		pimento = new JRadioButton("피망");
		cheese = new JRadioButton("치즈");
		pepperoni = new JRadioButton("페퍼로니");
		bacon = new JRadioButton("베이컨");
		// 크기 버튼
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");

		// 라디오 버튼은 버튼 그룹이 필요함
		// 버튼 그룹 생성
		ButtonGroup pizza = new ButtonGroup();
		pizza.add(combo);
		pizza.add(potato);
		pizza.add(bulgogi);
		
		ButtonGroup topping = new ButtonGroup();
		topping.add(pimento);
		topping.add(cheese);
		topping.add(pepperoni);
		topping.add(bacon);
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		/*
		combo.addActionListener(this); //이벤트
		potato.addActionListener(this);
		bulgogi.addActionListener(this);
		
		pimento.addActionListener(this); //이벤트
		cheese.addActionListener(this);
		pepperoni.addActionListener(this);
		bacon.addActionListener(this);
		
		small.addActionListener(this); //이벤트
		medium.addActionListener(this);
		large.addActionListener(this);
		*/
		
		// 종류 부착
		Border border = BorderFactory.createTitledBorder("종류");
		pizzaPanel.setBorder(border);
		
		pizzaPanel.add(combo);
		pizzaPanel.add(potato);
		pizzaPanel.add(bulgogi);
		add(pizzaPanel, BorderLayout.LINE_START);
		
		// 추가토핑 부착
		Border border2 = BorderFactory.createTitledBorder("추가토핑");
		toppingPanel.setBorder(border2);

		toppingPanel.add(pimento);
		toppingPanel.add(cheese);
		toppingPanel.add(pepperoni);
		toppingPanel.add(bacon);
		add(toppingPanel, BorderLayout.CENTER); 
		
		// 크기 부착
		Border border3 = BorderFactory.createTitledBorder("크기");
		sizePanel.setBorder(border3);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		add(sizePanel, BorderLayout.LINE_END); 
		
		// 4. resultPanel 생성
		resultPanel = new JPanel();
        
		button = new JButton("계산");
		backButton = new JButton("취소");
		
        textField = new JTextField(7);
        textField.setEditable(false);
        
        // 버튼 이벤트
        button.addActionListener(this);
        backButton.addActionListener(this);
		
        resultPanel.add(button);
        resultPanel.add(backButton);
        resultPanel.add(textField);
        
        add(resultPanel);
        add(resultPanel, BorderLayout.PAGE_END);
		setVisible(true);
	}
	
	// 라디오 버튼 선택 결과 출력
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			textField.setText("10700");
		}
		
	}
}

public class PizzaRadioButtonTest extends JFrame {
	public static void main(String[] args) {
		new MyFrame5();
	}

}
