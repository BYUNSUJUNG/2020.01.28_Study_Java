// https://asterisco.tistory.com/139?category=770618
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Calculator extends JFrame implements ActionListener {

	private JPanel displayPanel; // 1. �Է� ���ڰ� ��µǴ� �κ�
	private JPanel buttonPanel; // 2. ���� ��ư�� ���� �� �ִ� �κ�
	private JPanel debugPanel; // 3. ����� �κ�
	
	private JTextField display; // displayPanel�� �ؽ�Ʈ�� ���� �ʵ�
	
	private JButton[] buttons; // 0 ~ 9
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnProduct;
	private JButton btnDivide;
	private JButton btnEqual;
	private JButton btnCE;
	
	private JLabel prev; // ���� ����
	private JLabel operator; // ��Ģ���� ��ȣ
	private JLabel flag;
	
	public Calculator() {
	
		// ������ ����
		this.setSize(300, 400);
		this.setTitle("GUI TEST");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ��ü���� ���̾ƿ� ����
		this.setLayout(new BorderLayout()); 
		
		/*
		 * 3���� panel ��ü ����� ���� layout ����
		 */
		
		displayPanel = new JPanel(); // 1. �Է� ���ڰ� ��µǴ� �κ� 
		buttonPanel = new JPanel(); // 2. ���� ��ư�� ���� �� �ִ� �κ�
		debugPanel = new JPanel(); // 3. ����� �κ�
		
		// ������ ���̾ƿ� ����
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
		// ���� ��ư ��ü ����
		for(int i=0; i<buttons.length; i++){
			//buttons[i] = new JButton("" + i);
			buttons[i] = new JButton(Integer.toString(i)); // 0���� 9���� 10���� ����
			buttons[i].setFont(fontBtn);
			buttons[i].addActionListener(this); // �̺�Ʈ
		}
		
		// ��ư ��ü ����
		btnPlus = new JButton("+");
		btnMinus = new JButton("-");
		btnProduct = new JButton("*");
		btnDivide = new JButton("/");
		btnEqual = new JButton("=");
		btnCE = new JButton("CE");
		
		// �� ��ư�� �̺�Ʈ
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
		 * frame���ٰ� panel ���̱�
		 */
		this.add(displayPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(debugPanel, BorderLayout.SOUTH);
		
		//debugPanel.setVisible(false);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<buttons.length; i++){ // ���� �Է� �κ�
			if(e.getSource() == buttons[i]) {
				if(display.getText().equals("0")){ // 0�� ���, ���ڸ� �ٷ� ����
					display.setText(""+i);
					// display.setText(Integer.toString(i));
				}else { // 0 �̿��� ������ ���
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
	
			op1 = Double.parseDouble(prev.getText());  //����->����(double)
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


