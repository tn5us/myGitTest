package ch09;

public class Car {
	//Car의 멤버변수
	int speed; //속도
	
	//Car의 멤버 메소드
	public void setSpeed(int speed) {//속도 변경할 메소드
		this.speed = speed;
		System.out.println(speed);
	}
}
