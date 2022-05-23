package ch17;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFirstApp extends JFrame {
	public MyFirstApp() {
		super("카페");
				
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		
		panel.setBackground(Color.red);
		panel1.setBackground(Color.CYAN);
		panel2.setBackground(Color.GREEN);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.black);
		
		
		JLabel label = new JLabel("Cafe에 오신것을 환영합니다!");
		JLabel label2 = new JLabel("음료를 선택하세요!");
		panel1.add(label);
		panel3.add(label2);

		JButton button1 = new JButton("아메리카노");
		JButton button2 = new JButton("라떼");
		JButton button3 = new JButton("에스프레소");
		JButton button4 = new JButton("콜드브루");
		JButton button5 = new JButton("아이스티");
		JButton button6 = new JButton("카페모카");
		JButton button7 = new JButton("종료");
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel4.add(button7);
		
		panel.add(panel1);
		
		add(panel, "North");
		add(panel2, "Center");
		add(panel3, "West");
		add(panel4, "South");

		ActionListener handler = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("아메리카노")) {
					JOptionPane.showMessageDialog(null, "아메리카노를 선택하셨습니다.\n가격: 4,500원", "아메리카노", JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("라떼")) {
					JOptionPane.showMessageDialog(null, "라떼를 선택하셨습니다. \n가격: 5,000원", "라떼", JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("에스프레소")) {
					JOptionPane.showMessageDialog(null, "에스프레소를 선택하셨습니다. \n가격: 4,000원", "에스프레소", JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("콜드브루")) {
					JOptionPane.showMessageDialog(null, "콜드브루를 선택하셨습니다. \n가격: 5,000원", "콜드브루", JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("아이스티")) {
					JOptionPane.showMessageDialog(null, "아이스티를 선택하셨습니다. \n가격: 4,000원", "아이스티", JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("카페모카")) {
					JOptionPane.showMessageDialog(null, "카페모카를 선택하셨습니다. \n가격: 5,000원", "카페모카", JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("종료")) {
					JOptionPane.showMessageDialog(null, "프로그램을 종료하시겠습니까?", "종료", JOptionPane.OK_CANCEL_OPTION);
					System.exit(0);
				}
			}
		};	
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);	
		button5.addActionListener(handler);
		button6.addActionListener(handler);
		button7.addActionListener(handler);
			
		setSize(250,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		

	}
	public static void main(String[] args) {
		new MyFirstApp();
	}
}