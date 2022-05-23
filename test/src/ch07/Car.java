package ch07;

public class Car {
	//멤버 변수
	String color; //색상
	int speed; //속도
	int gear;//기어
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}//주소값에 들어있는 변수가 들어있는 값들을 출력할수 있다
	void changeGear (int g) {
		gear = g; //멤버변수의 기어를 로컬변수 g로 초기화
		
	}
	void speedUp() {
		speed = speed +10;
	}
	void speedDown() {
		speed = speed -10;
	}
	void print() {
		System.out.println("차량 색상: "+ color);
		System.out.println("차량 속도: "+ speed+ "km/h");
		System.out.println("차량 기어단수: "+gear +"단");
	}
}
