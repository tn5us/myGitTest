package ch11;

public abstract class Shape {//1개라도 추상멤버가 있으면 abstract 화 함.
	int x,y;//멤버변수
	public void move(int x, int y) {
		this.x =x;
		this.y =y;		
	}	
	public abstract void draw();//추상메소드
}
