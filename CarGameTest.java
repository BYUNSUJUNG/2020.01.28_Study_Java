import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

class MyPanel27 extends JPanel {

	BufferedImage img = null;
	int img_x = 100, img_y = 100;

	public MyPanel27() {
		try { // 이미지 읽고, 오류가 발생하면 실행 종료
			img = ImageIO.read(new File("car.gif"));

		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch (keycode) { // 키 리스너를 무명클래스로 작성
				case KeyEvent.VK_UP:	img_y -= 10;	break;
				case KeyEvent.VK_DOWN:	img_y += 10;	break;
				case KeyEvent.VK_LEFT:	img_x -= 10;	break;
				case KeyEvent.VK_RIGHT:	img_x += 10;	break;
				}
				repaint();
			}
			public void keyReleased(KeyEvent arg0) {		}
			public void keyTyped(KeyEvent arg0) {			}

		});
		this.requestFocus(); // 키보드 포커스를 요청하고, 패널이 포서스를 받을 수 있게 함
		setFocusable(true);
	}

	public void paintComponent(Graphics g) {
		// 자동차 이미지를 해당 위치에 그린다
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);

	}
}

public class CarGameTest extends JFrame {
	public CarGameTest() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel27());
		setVisible(true);
	}

	public static void main(String[] args) {
		CarGameTest s = new CarGameTest();
	}
}