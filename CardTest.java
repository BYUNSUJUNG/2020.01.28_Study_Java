import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame11 extends JFrame implements ActionListener {
	
	JPanel panel;
	Cards cards;
	
	public MyFrame11() {
		
		// ��ġ �����ڸ� CardLayoutTest�� ����
		setTitle("CardLayoutTest");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// panel�� ��ġ �����ڸ� GridLayout�� ����
		panel = new JPanel(new GridLayout(0,5,10,0));
		
		addButton("<<",panel); // addButton �޼ҵ� 
		addButton("<",panel);
		addButton(">",panel);
		addButton(">>",panel);
		addButton("����",panel);
		add(panel,"North");
		
		cards = new Cards();
		add(cards,"Center");
		
		setVisible(true);
	}
	
	// ��ư�� �����ϰ� �̺�Ʈ�� �ο��Ѵ�.
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this); // actionPerformed�� �۵��ϴ� �κ�
		target.add(button);
	}
	
	private class Cards extends JPanel {
		CardLayout layout;
		
		public Cards() {
			layout = new CardLayout();
			setLayout(layout);
			for(int i=1; i<=10; i++) {
				add(new JButton("���� ī���� ��ȣ��"+i+"�Դϴ�"),"Center");
			}
			
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����")) {
			System.exit(0);
		} else if(e.getActionCommand().equals("<<")) {
			cards.layout.first(cards);
		} else if(e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
		} else  if(e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
		} else if(e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}
	} 
}

public class CardTest {
	public static void main(String[] args) {
		MyFrame11 f = new MyFrame11();
	}

}
