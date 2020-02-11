import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame11 extends JFrame implements ActionListener {
	
	JPanel panel;
	Cards cards;
	
	public MyFrame11() {
		
		// 배치 관리자를 CardLayoutTest로 지정
		setTitle("CardLayoutTest");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// panel의 배치 관리자를 GridLayout로 지정
		panel = new JPanel(new GridLayout(0,5,10,0));
		
		addButton("<<",panel); // addButton 메소드 
		addButton("<",panel);
		addButton(">",panel);
		addButton(">>",panel);
		addButton("종료",panel);
		add(panel,"North");
		
		cards = new Cards();
		add(cards,"Center");
		
		setVisible(true);
	}
	
	// 버튼을 생성하고 이벤트를 부여한다.
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this); // actionPerformed가 작동하는 부분
		target.add(button);
	}
	
	private class Cards extends JPanel {
		CardLayout layout;
		
		public Cards() {
			layout = new CardLayout();
			setLayout(layout);
			for(int i=1; i<=10; i++) {
				add(new JButton("현재 카드의 번호는"+i+"입니다"),"Center");
			}
			
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("종료")) {
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
