package ch12;

public class MemberOuter {
	private int num = 1;//고객번호
	private String name = "홍길동";// 이름
	private String email = "hong@gmail.com";
	class Inner {//내부클래스
		void print() {
			System.out.println("-------------------");
			System.out.println("고객번호: "+ num);
			System.out.println("이름: "+ name);
			System.out.println("이메일: "+email);
			System.out.println("-------------------");
		}		
	}//inner class end
	public static void main(String[] args) {
		MemberOuter m = new MemberOuter();
		MemberOuter.Inner in = m.new Inner();
		in.print();
	}
	
}
