package ch11;

public class Coin1Demo implements Coin {
	//implements Coin을 쓸수도 있고 안쓸 수 도 있다.
	public static void main(String[] args) {
		//인터페이스의 상수는 static 영역에 있기 때문에 클래스 이름.상수이름으로 접근가능하다.
		System.out.println("Dime은 "+ Coin.DIME+"센트입니다.");
	}
}
