package ch10;

class Pa{
	String name = "홍길동";
	public void print() {
		System.out.println("이름: "+ name);
	}
}
class Ch extends Pa{
	int age =30;
	public void print() {
		super.print();
		System.out.println("나이: "+ age);
	}
}
public class Poly2 {
	public static void main(String[] args) {
		String tel = "010-1234-5678";
		Pa c = new Ch();
		c.print();
		System.out.println("폰번호: "+tel);	
	}
}
