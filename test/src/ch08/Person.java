package ch08;

public class Person {
	//멤버변수
	private String name;//홍길동
	private int height;//180
	private int weight;//75
	
	public Person() {//기본생성자
		this("홍길동",180,75);//this() 생성자 호출, 반드시 첫줄에 써야함.
	}
	
	public Person(String name) {//name = 김수현
		this(name,177,60);
	}
	
	public Person(String name, int height) {//name = 박찬호, height = 185
		this(name, height, 70);//this()는 나와 이름이 같은 생성자 호출 
	}
	
	public Person(String name, int height, int weight) {
		this.name = name; //홍길동 -->김수현(사실 값이 바뀌는 것이 아니라 다른번지에서 일어나는일)-->박찬호 ->박지성
		this.height = height;//180 -->177
		this.weight = weight;//75 -->60
		
	}
	
	public void showinfo() {
		System.out.println("=== 신상정보 ===");
		System.out.println("이름 : "+ name);
		System.out.println("신장 : "+ height);
		System.out.println("체중 : "+ weight);		
	}
}
