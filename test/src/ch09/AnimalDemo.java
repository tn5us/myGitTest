package ch09;

class Animal {//부모클래스
	
	public Animal(String s) {//매개변수가 하나인 생성자 s= 원숭이 ->사자(주소값 다름
		System.out.println("동물: "+s);
	}	
}

class Mammal extends Animal{
	public Mammal() {
		//super()를 쓸때에는 반드시 첫째 줄에 써야한다.
		super("원숭이");//부모클래스 생성자 호출 super() 부모클래스의 생성자 호출
		System.out.println("포유류: 원숭이");
	}
	public Mammal(String s) {//s=사자
		super(s);//부모 클래스 생성자 호출하는 용도
		//this()=>생성자 호출
		System.out.println("포유류:"+ s);	
	}	
}

public class AnimalDemo {
	public static void main(String[] args) {
		Mammal ape = new Mammal();//객체 생성및 기본생성자 호출
		System.out.println(ape);
		Mammal lion = new Mammal ("사자"); //객체 생성및 매개변수가 있는 생성자 호출
		System.out.println(lion);				
	}
}
