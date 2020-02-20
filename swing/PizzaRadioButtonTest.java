// p131, topingPanel �ȳ����ϱ� �����ϱ�
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
		setTitle("���� ���� �ֹ� �׽�Ʈ");
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. topPanel ���� 
		topPanel = new JPanel();
		
		JLabel label = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�");
		topPanel.add(label);
		add(topPanel, BorderLayout.PAGE_START);

		// 2. pizzaPanel ����
		pizzaPanel = new JPanel();
		pizzaPanel.setLayout(new BoxLayout(pizzaPanel, BoxLayout.Y_AXIS));
		// 3. topingPanel ����
		toppingPanel = new JPanel();
		toppingPanel.setLayout(new BoxLayout(toppingPanel, BoxLayout.Y_AXIS));
		// 4. sizePanel ����
		sizePanel = new JPanel();
		sizePanel.setLayout(new BoxLayout(sizePanel, BoxLayout.Y_AXIS));
		
		// ���� ��ư ����
		// ���� ��ư
		combo = new JRadioButton("�޺�");
		potato = new JRadioButton("��������");
		bulgogi = new JRadioButton("�Ұ��");
		// �߰����� ��ư
		pimento = new JRadioButton("�Ǹ�");
		cheese = new JRadioButton("ġ��");
		pepperoni = new JRadioButton("���۷δ�");
		bacon = new JRadioButton("������");
		// ũ�� ��ư
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");

		// ���� ��ư�� ��ư �׷��� �ʿ���
		// ��ư �׷� ����
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
		combo.addActionListener(this); //�̺�Ʈ
		potato.addActionListener(this);
		bulgogi.addActionListener(this);
		
		pimento.addActionListener(this); //�̺�Ʈ
		cheese.addActionListener(this);
		pepperoni.addActionListener(this);
		bacon.addActionListener(this);
		
		small.addActionListener(this); //�̺�Ʈ
		medium.addActionListener(this);
		large.addActionListener(this);
		*/
		
		// ���� ����
		Border border = BorderFactory.createTitledBorder("����");
		pizzaPanel.setBorder(border);
		
		pizzaPanel.add(combo);
		pizzaPanel.add(potato);
		pizzaPanel.add(bulgogi);
		add(pizzaPanel, BorderLayout.LINE_START);
		
		// �߰����� ����
		Border border2 = BorderFactory.createTitledBorder("�߰�����");
		toppingPanel.setBorder(border2);

		toppingPanel.add(pimento);
		toppingPanel.add(cheese);
		toppingPanel.add(pepperoni);
		toppingPanel.add(bacon);
		add(toppingPanel, BorderLayout.CENTER); 
		
		// ũ�� ����
		Border border3 = BorderFactory.createTitledBorder("ũ��");
		sizePanel.setBorder(border3);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		add(sizePanel, BorderLayout.LINE_END); 
		
		// 4. resultPanel ����
		resultPanel = new JPanel();
        
		button = new JButton("���");
		backButton = new JButton("���");
		
        textField = new JTextField(7);
        textField.setEditable(false);
        
        // ��ư �̺�Ʈ
        button.addActionListener(this);
        backButton.addActionListener(this);
		
        resultPanel.add(button);
        resultPanel.add(backButton);
        resultPanel.add(textField);
        
        add(resultPanel);
        add(resultPanel, BorderLayout.PAGE_END);
		setVisible(true);
	}
	
	// ���� ��ư ���� ��� ���
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
