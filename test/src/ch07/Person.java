package ch07;

public class Person {
	//멤버 변수
	private String name;
	private int age;
	private double height;
	String email;
	String address;	
	//setter : set+변수명(첫글자 대문자)
	public void setName(String name) { //name은 지역변수 (로컬변수)
		//this는 멤버변수를 가리킴
		this.name = name;
//		name = n; 지역변수와 멤버변수 이름이 다르면 this 생략하고 이렇게 써도 된다.
	}
	//getter: get+변수명
	public String getName() {
		return name;
		
	}	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}	
	public void setAge(int age) {
		if(age<0 || age >150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
			this.age = age;
		}
	}	
	public int getAge() {
		return age;		
	}	
	public void print() {
		System.out.println("이름\t");
	}
}
