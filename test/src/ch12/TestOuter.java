package ch12;

public class TestOuter {
	private int data = 30;
	class Inner {//내부클래스
		void msg() {
			System.out.println("data is "+ data);
			//내부클래스는 외부클래스의 멤버를 자유롭게 사용가능(private 처리했다고해도)
		}
	}//end inner class
	public static void main(String[] args) {
		TestOuter obj = new TestOuter();//외부클래스 객체생성
		TestOuter.Inner in = obj.new Inner(); //내부클래스 객체생성
		in.msg();
		
	}
}
