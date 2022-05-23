package ch17;

import java.applet.AudioClip;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyApp extends JApplet implements ActionListener,MouseListener,
MouseMotionListener, KeyListener{
	private Random random;
	private AudioClip audio;
	private JButton play, stop, loop;
	private Font font;
	private FontMetrics fm;
	private String message;
	private int x,y;
	private int width, height;
	private Image img;
	private boolean flag = true;
	
	@Override
	public void init() {
		JPanel pa = new JPanel();
		random = new Random();
		setSize(400,400);
		setLayout(new FlowLayout());
		getContentPane().setBackground(new Color(200, 200, 255));
		
		message = "My MP3";
		font = new Font("굴림", Font.ITALIC, 50);
		fm= getFontMetrics(font);
	
		
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		setFocusable(true);
		requestFocus();	
		play = new JButton("play");
		stop = new JButton("stop");
		loop = new JButton("loop");

		add(play);
		add(stop);
		add(loop);
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
		
		message = "My MP3";
		font = new Font("굴림", Font.ITALIC, 50);
		fm= getFontMetrics(font);
	
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0; i<100; i++) {
			int red=random.nextInt(256);//0~255
			int green= random.nextInt(256);
			int blue= random.nextInt(256);
			g.setColor(new Color(red, green, blue));
			
		width = img.getWidth(null);
		height = img.getHeight(null);
		if(flag) {
			g.drawImage(img, x, y, this);}
		g.setFont(font);
		g.drawString(message, x, y);}
										
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		System.out.println(e.getSource());
		if(btn == play) {
			audio.play();
		}else if(btn ==stop) {
			audio.stop();
		}else if(btn ==loop) {
			audio.loop();
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//문자
		switch (e.getKeyCode()) {//키코드값에 따라 분기
		case KeyEvent.VK_UP://위쪽 키를 눌렀을때
			y= Math.max(0,y-5);	break;
		case KeyEvent.VK_DOWN://아래쪽 키를 눌렀을때 발생
			y= Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT://왼쪽 키
			x= Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT:
			x = Math.min(300-width, x+5); break;

		default:
			break;}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		x= e.getX();
		y= e.getY();
		repaint();
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {

				
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
