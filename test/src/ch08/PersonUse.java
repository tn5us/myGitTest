package ch08;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person(); //객체 생성과 동시에 기본생성자 호출
		System.out.println(p1);
		p1.showinfo();
		
		Person p2 = new Person("홍길동");//객체생성과 동시에 매개변수가 하나짜리인 생성자 호출
		System.out.println(p2);
		p2.showinfo();
		
		Person p3 = new Person("박찬호",185);
		p3.showinfo();
		
		Person p4 = new Person("박지성",175,72);
		p4.showinfo();
	}	
}
