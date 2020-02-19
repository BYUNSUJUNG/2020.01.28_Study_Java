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
             setTitle("���� ����ϱ�");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             // ������ ��ü ����
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
       // �ؽ�Ʈ �ʵ�� ��ư�� �׼� �̺�Ʈ ó�� 
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
