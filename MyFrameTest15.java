import java.awt.*;
import javax.swing.*;

class MyFrame15 extends JFrame {

	public MyFrame15() {
		// p는 p1, p2, p3를 담을 판넬
		// p1는 텍스트 필드를 넣을 판넬
		// p2는 버튼 c를 넣을 판넬
		// p3는 1~9의 숫자와 사칙 연산 기호를 넣을 판넬
		
		JPanel p, p1, p2, p3; // 판넬 4개
		JTextField tf; // 텍스트 필드
		JButton[] b = new JButton[17]; // 17개의 버튼 배열 생성
		
		p = new JPanel(); // p 판넬 생성
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS)); // p 판넬의 레이아웃은 BoxLayout, Y_AXIS는 Y축을 기준으로 중앙정렬
		p1 = new JPanel(); // p1 판넬 생성 
		FlowLayout layout = new FlowLayout(); // FlowLayout 생성
		layout.setAlignment(FlowLayout.LEFT); // FlowLayout의 왼쪽에 정렬
		layout.setVgap(0); // 수직 간격
		p1.setLayout(layout); // p1 판넬의 레이아웃은 FlowLayout
		
		p2 = new JPanel(); // p2 판넬 생성
		p2.setLayout(layout); // p2 판넬의 레이아웃은 FlowLayout
		
		p3 = new JPanel(new GridLayout(0,4)); // p3 판넬의 레이아웃은 GridLayout, rows:0, cols:4
		
		tf = new JTextField(30); // 문자 30개 입력가능한 JTextField
		p1.add(tf); // 텍스트 필드를 p1에 붙인다
		
		b[0] = new JButton("C");
		b[1] = new JButton("7");
		b[2] = new JButton("8");
		b[3] = new JButton("9");
		b[4] = new JButton("/");
		b[5] = new JButton("4");
		b[6] = new JButton("5");
		b[7] = new JButton("6");
		b[8] = new JButton("*");
		b[9] = new JButton("1");
		b[10] = new JButton("2");
		b[11] = new JButton("3");
		b[12] = new JButton("-");
		b[13] = new JButton("0");
		b[14] = new JButton("+/-");
		b[15] = new JButton("=");
		b[16] = new JButton("+");
		
		p2.add(b[0]);
		for(int i=1; i<17; i++) {
			p3.add(b[i]);
		}
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}
public class MyFrameTest15 {

	public static void main(String[] args) {
		new MyFrame15();

	}

}
