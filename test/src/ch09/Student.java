package ch09;

public class Student {
	//멤버변수
	//protected 또한 자식클래스에서 접근가능, private 만 상속이 안됨
	protected String name;//사임당-> 홍길동
	protected String num; //2203-> 2001
	protected String major;//컴공-> 전자
	protected int year;//1-> 3
	
	public Student() {	}// 기본생성자

	//생성자로 매개변수 처리
	public Student(String name, String num, String major, int year) {		
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	//일반 메소드로 매개변수 처리
	public void input(String name, String num, String major, int year) {
		//"사임당", "2203","컴공", 1 => //"홍길동", "2001", "전자", 3(같은 s1번지이므로 값이 바뀜)
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}	
}
