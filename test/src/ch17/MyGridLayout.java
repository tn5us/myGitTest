package ch17;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame{
	public MyGridLayout() {
		super("MyGridLayout");
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(5, 2));
		
		String label[] = {"이름","id","비밀번호","이메일","HP"};
		String text[] = {"홍길동","hong","1234","hong@daum.net","010-1234-5678"};
		
		for(int i=0; i<=label.length; i++) {
			c.add(new JLabel(label[i]));
			if (i != 2) {
				c.add(new JTextField(text[i], 20));
			} else {
				c.add(new JPasswordField(text[i], 20));
			}
		}
				
		setSize(250,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}
}
