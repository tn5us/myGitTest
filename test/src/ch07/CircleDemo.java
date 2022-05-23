package ch07;

public class CircleDemo {
	public static void main(String[] args) {
		circle mycircle = new circle();
		mycircle.radius=10.0;
		mycircle.show(mycircle.radius, mycircle.findArea());
		
	}
}

class circle{//퍼블릭 쓰면 안됨 .. 메인메소드만 public
	//멤버변수
	double radius; //10.0
	//멤버 메소드
	double findArea() {
		return 3.14 * radius * radius; //3.14 *10.0*10.0
	}
	void show (double x, double y) { //x=10.0, y= 3.14 *10.0*10.0
		System.out.printf("반지름 =%.1f, 넓이 = %.1f\n", x, y);
	}
}
