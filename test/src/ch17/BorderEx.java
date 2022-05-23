package ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderEx extends Frame {
	//GUI프로그램 코딩에서는 main메소드에서 GUI코딩보다 Frame을 extends받아서 기본생성자 안에서
	//GUI코드 처리하는 것을 더 권장한다.
	public BorderEx() {
		setTitle("BorderLayout 예제");
		setSize(300,200);
		setVisible(true);
		
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		Button b5 = new Button("center");
		//Frame의 기본레이아웃이 BorderLayout이므로 setLayout을 생략 가능
		//setLayout(new BorderLayout());
		add(b1,"East");
		add(b2,"West");
		add(b3,"South");
		add(b4,"North");
		add(b5,"Center");//또는 add(b5)만해도 센터 처리 해줌
		
		//윈도우 창 닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//정상종료 0
			}
		});
		
		
	}//end BorderEx()
	public static void main(String[] args) {
		new BorderEx();
	}
	
}
