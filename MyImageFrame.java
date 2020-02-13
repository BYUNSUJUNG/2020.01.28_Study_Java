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
			img = ImageIO.read(new File("cat.jpg")); // �̹��� �б�
		} catch(IOException e) { // ����ó��
			System.out.println(e.getMessage());
			System.exit(0);
		}
		add(new MyPanel21());
		pack();
		setVisible(true);
	}
	
	class MyPanel21 extends JPanel {
		// �ʵ� img�� ����ϱ� ���ؼ� MyPanel21�� ���� Ŭ������ ����
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
		
		public Dimension getPreferredSize() {
			// �̹����� ũ�⿡ �г��� ũ�⸦ �����
			// getPreferredSize()�� ������Ʈ�� ���ϴ� ũ�⸦ ��ġ �����ڿ��� �˸��� �޼ҵ�
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
