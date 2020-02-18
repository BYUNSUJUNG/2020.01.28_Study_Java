// https://asterisco.tistory.com/139?category=770618
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Calculator extends JFrame implements ActionListener {

	private JPanel displayPanel; // 1. 입력 숫자가 출력되는 부분
	private JPanel buttonPanel; // 2. 숫자 버튼을 누를 수 있는 부분
	private JPanel debugPanel; // 3. 디버그 부분
	
	private JTextField display; // displayPanel에 텍스트를 넣을 필드
	
	private JButton[] buttons; // 0 ~ 9
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnProduct;
	private JButton btnDivide;
	private JButton btnEqual;
	private JButton btnCE;
	
	private JLabel prev; // 이전 숫자
	private JLabel operator; // 사칙연산 기호
	private JLabel flag;
	
	public Calculator() {
	
		// 프레임 설정
		this.setSize(300, 400);
		this.setTitle("GUI TEST");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 전체적인 레이아웃 설정
		this.setLayout(new BorderLayout()); 
		
		/*
		 * 3개의 panel 객체 만들고 각자 layout 설정
		 */
		
		displayPanel = new JPanel(); // 1. 입력 숫자가 출력되는 부분 
		buttonPanel = new JPanel(); // 2. 숫자 버튼을 누를 수 있는 부분
		debugPanel = new JPanel(); // 3. 디버그 부분
		
		// 각각의 레이아웃 설정
		displayPanel.setLayout(new FlowLayout());
		buttonPanel.setLayout(new GridLayout(0, 4, 5, 5));
		debugPanel.setLayout(new FlowLayout());
		
		
		/*
		 * 1. displayPanel
		 */
		
		display = new JTextField(11);
		display.setText("0");
		display.setHorizontalAlignment(JTextField.RIGHT);
		
		Font font = new Font("Serif", Font.BOLD, 30);
		display.setFont(font);
		displayPanel.add(display);
		
		/*
		 * 2. buttonPanel
		 */
	
		Font fontBtn = new Font("Serif", Font.BOLD, 20);
		
		buttons = new JButton[10];
		// 실제 버튼 객체 생성
		for(int i=0; i<buttons.length; i++){
			//buttons[i] = new JButton("" + i);
			buttons[i] = new JButton(Integer.toString(i)); // 0부터 9까지 10개의 숫자
			buttons[i].setFont(fontBtn);
			buttons[i].addActionListener(this); // 이벤트
		}
		
		// 버튼 객체 생성
		btnPlus = new JButton("+");
		btnMinus = new JButton("-");
		btnProduct = new JButton("*");
		btnDivide = new JButton("/");
		btnEqual = new JButton("=");
		btnCE = new JButton("CE");
		
		// 각 버튼의 이벤트
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnProduct.addActionListener(this);
		btnDivide.addActionListener(this);
		btnEqual.addActionListener(this);
		btnCE.addActionListener(this);
		
		// 1 2 3 +
		// 4 5 6 -
		// 7 8 9 *
		// 0 / CE =
		
		buttonPanel.add(buttons[1]);
		buttonPanel.add(buttons[2]);
		buttonPanel.add(buttons[3]);
		buttonPanel.add(btnPlus);
		
		buttonPanel.add(buttons[4]);
		buttonPanel.add(buttons[5]);
		buttonPanel.add(buttons[6]);
		buttonPanel.add(btnMinus);
		
		buttonPanel.add(buttons[7]);
		buttonPanel.add(buttons[8]);
		buttonPanel.add(buttons[9]);
		buttonPanel.add(btnProduct);
		
		buttonPanel.add(buttons[0]);
		buttonPanel.add(btnDivide);
		buttonPanel.add(btnCE);
		buttonPanel.add(btnEqual);
		
		/*
		
		 * 3. debugPanel
		
		 */
		
		prev = new JLabel("");
		operator = new JLabel("");
		flag = new JLabel("");
		
		debugPanel.add( new JLabel("PREV:"));
		debugPanel.add(prev);
		debugPanel.add( new JLabel("OPERATOR:"));
		debugPanel.add(operator);
		debugPanel.add( new JLabel("FLAG:"));
		debugPanel.add(flag);
		
		
		/*
		 * frame에다가 panel 붙이기
		 */
		this.add(displayPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(debugPanel, BorderLayout.SOUTH);
		
		//debugPanel.setVisible(false);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<buttons.length; i++){ // 숫자 입력 부분
			if(e.getSource() == buttons[i]) {
				if(display.getText().equals("0")){ // 0일 경우, 숫자를 바로 넣음
					display.setText(""+i);
					// display.setText(Integer.toString(i));
				}else { // 0 이외의 숫자일 경우
					if(operator.getText().equals("")) {
						display.setText(  display.getText() + i);
					}else {
						if(flag.getText().equals("")) {
							display.setText(""+i);
							flag.setText("#");
						}else {
							display.setText(  display.getText() + i);
						} 
					} 
				} 
			} //end of if
		} // end of for

		if(e.getSource() == btnEqual) { // btnEqual "="

			double op1, op2, result;
	
			op1 = Double.parseDouble(prev.getText());  //문자->숫자(double)
			op2 = Double.parseDouble(display.getText());
	
			if(operator.getText().equals("+")) {
				result = op1 + op2;
				display.setText("" + result);
				// display.setText( String.valueOf(result));
			}
			if(operator.getText().equals("-")) {
				result = op1 - op2;
				display.setText("" + result);
				// display.setText( String.valueOf(result));
			}
			if(operator.getText().equals("*")) {
				result = op1 * op2;
				display.setText("" + result);
				// display.setText( String.valueOf(result));
			}
			if(operator.getText().equals("/")){
				result = op1 / op2;
				display.setText("" + result);
				// display.setText( String.valueOf(result));
			}
		}

		if(e.getSource() == btnPlus) // "+"
		{
			prev.setText( display.getText() );
			operator.setText("+");
			flag.setText("");
		}
		if(e.getSource() == btnMinus) { // "-"
			prev.setText( display.getText() );
			operator.setText("-");
			flag.setText("");
		}
		if(e.getSource() == btnProduct) { // "*"
			prev.setText( display.getText() );
			operator.setText("*");
			flag.setText("");
		}
		if(e.getSource() == btnDivide) { // "/"
			prev.setText( display.getText() );
			operator.setText("/");
			flag.setText("");
		}
		if(e.getSource() == btnCE) {
			display.setText("0");
			prev.setText("");
			operator.setText("");
			flag.setText("");
		}
	}

}

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	
	}
}


