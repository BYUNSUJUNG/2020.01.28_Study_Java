package swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame4 extends JFrame {
		private JTextField textField;
		private JButton button;
 
       public MyFrame4() {
             setSize(400, 100);
             setTitle("제곱 계산하기");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             // 리스너 객체 생성
             ButtonListener listener = new ButtonListener();
           
             JPanel panel = new JPanel();
             textField = new JTextField(30);
             panel.add(textField);
             
             button = new JButton("OK");
             button.addActionListener(listener);
             panel.add(button);
             add(panel);
             setVisible(true);
       }
       // 텍스트 필드와 버튼의 액션 이벤트 처리 
       private class ButtonListener implements ActionListener {
             public void actionPerformed(ActionEvent e) {

                    if (e.getSource() == button) {
                    	textField.setText("I've clicked");
                    }
             }
       }
}
public class ButtonClickTextFieldPrintTest extends JFrame {
	public static void main(String[] args) {
		new MyFrame4();
	}

}
