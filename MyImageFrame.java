import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MyImageFrame extends JFrame {

	
	BufferedImage img = null;
	
	public MyImageFrame() {
		setTitle("Image Load Test");
		
		try {
			img = ImageIO.read(new File("cat.jpg")); // 이미지 읽기
		} catch(IOException e) { // 예외처리
			System.out.println(e.getMessage());
			System.exit(0);
		}
		add(new MyPanel21());
		pack();
		setVisible(true);
	}
	
	class MyPanel21 extends JPanel {
		// 필드 img를 사용하기 위해서 MyPanel21을 내부 클래스로 선언
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
		
		public Dimension getPreferredSize() {
			// 이미지의 크기에 패널의 크기를 맞춘다
			// getPreferredSize()는 컴포넌트가 원하는 크기를 배치 관리자에게 알리는 메소드
			if(img==null) {
				return new Dimension(100,100);
			} else {
				return new Dimension(img.getWidth(null), img.getHeight(null));
			}
		}
	}

	public static void main(String[] args) {
		new MyImageFrame();
	}
}
