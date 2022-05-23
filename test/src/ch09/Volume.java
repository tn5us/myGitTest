package ch09;

public class Volume extends Area{// Area의 자식클래스
	//멤버변수
	private int height;//0으로 초기화 되어있음 =>30
		
	//기본생성자
	public Volume() {		
	}
	public Volume(int width, int length, int height) {//10,20,30
		super(width, length); //부모클래스의 생성자 호출
		this.height=height;		
	}	
	public int getVolume() {
		return getArea()*height;//200*30		
	}
}
