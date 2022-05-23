package ch10;

public class StaticVar2 {
	static int total;//static 메모리(클래스 영역)에 올라감(하나의 주소값을 공유한다.)
	String model;//객체타입은 heap영역에 생성(new, non-static)
	public StaticVar2(String model) {//매개변수가 있는 생성자
		this.model=model;
		total++;
		
	}
	public StaticVar2() {//기본생성자도 사용하지 않더라도 만들면 좋다.
	}
	
}
