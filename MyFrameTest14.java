import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

class MyFrame14 extends JFrame {
	
	JPanel p = new JPanel(); // 판넬 생성
	JLabel[] labels = new JLabel[30]; // 라벨로 배열 
	
	public MyFrame14() {
		p.setLayout(null); // 레이아웃 없음
		for(int i=0; i<30; i++) {
			labels[i] = new JLabel(""+i); // 0부터 29까지 숫자를 넣은 라벨을 생성
			int x = (int)(500*Math.random()); // setLocation에 이용될  x, y는 랜덤값
			int y = (int)(200*Math.random());
			labels[i].setForeground(Color.MAGENTA); // 폰트 색
			labels[i].setLocation(x, y); // 라벨의 위치
			labels[i].setSize(20,20); // 라벨의 크기
			p.add(labels[i]); // 라벨를 판넬에 붙인다
		}	
		setSize(500,300); // 판넬의 사이즈
		add(p); // 판넬을 프라임에 붙인다
		setVisible(true); // 보여짐
	}
}
public class MyFrameTest14 {

	public static void main(String[] args) {
		MyFrame14 f = new MyFrame14();

	}

}
