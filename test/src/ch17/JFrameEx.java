package ch17;

import javax.swing.JFrame;

public class JFrameEx extends JFrame{
	public JFrameEx() {
		super("JFrame 예제");//제목처리
//		setTitle("JFrame 예제"); //이렇게도 가능
		
		setSize(300,200);
		setVisible(true);//이거 반드시 해야 화면에 나옴!
	}
	public static void main(String[] args) {
		new JFrameEx();// 닫기 기능이 자동으로 장착!
	}
	
}
