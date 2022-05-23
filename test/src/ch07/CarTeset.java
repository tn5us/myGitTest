package ch07;

public class CarTeset {
	public static void main(String[] args) {
	Car myCar = new Car(); //객체 생성, 참조변수인 my car는 car라는 객체가 있는 주소값을 기억한다.
	
	myCar.changeGear(1);
	myCar.speedUp();
	System.out.println(myCar);
}
}
