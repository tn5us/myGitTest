package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyEventColor extends JFrame{
	public MyEventColor() {
		super("MyEventColor");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		JButton button1 = new JButton("red");
		JButton button2 = new JButton("green");
		JButton button3 = new JButton("blue");
		JButton button4 = new JButton("yellow");
		
		add(button1, "North");
		add(button2, "East");
		add(button3, "South");
		add(button4, "West");
		
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.yellow));		
	}
	public static void main(String[] args) {
		new MyEventColor();
	}

}
