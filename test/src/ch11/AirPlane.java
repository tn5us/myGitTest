package ch11;

public class AirPlane implements Flyer {
	//인터페이스를 상속받으면 모든 추상메소드들을 구현(오버라이딩)해야한다.
	@Override
	public void takeOff() {
		System.out.println("AirPlane 이륙");
	}

	@Override
	public void fly() {
		System.out.println("AirPlane 비행");
	}

	@Override
	public void land() {
		System.out.println("AirPlane 착륙");
	}
}
