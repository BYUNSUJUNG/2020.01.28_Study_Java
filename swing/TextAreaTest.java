package swing;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame3 extends JFrame implements ActionListener {
       private JTextField textField;
       private JTextArea textArea;
 
       public MyFrame3() {
             setTitle("Text Area Test");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             textField = new JTextField(30); // (ĭ��)
             textField.addActionListener(this);
             
             textArea = new JTextArea(10,30); // (�ټ�, ĭ��)
             textArea.setEditable(false);
             
             add(textField, BorderLayout.NORTH);
             add(textArea, BorderLayout.CENTER);
             
             pack();
             setVisible(true);
             
             JPanel panel = new JPanel();
       }
       public void actionPerformed(ActionEvent evt) {
    	   // �Է��� ���ϰ� �ϱ� ���ؼ� �ؽ�Ʈ �ʵ忡 �ִ� �ؽ�Ʈ�� ��� ����
    	   String text = textField.getText();
    	   textArea.append(text+"\n");
    	   textField.selectAll();
    	   textArea.setCaretPosition(textArea.getDocument().getLength());
    	   
       }
}
public class TextAreaTest extends JFrame {
	public static void main(String[] args) {
		new MyFrame3();
	}

}
