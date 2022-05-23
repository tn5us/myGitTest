package ch12;
//정적중첩클래스(static 내부클래스)
public class StaticOuter {
	static int data = 30;
	int data2 = 50;
	static class StaticInner{
		void msg() {
			System.out.println("data is "+ data);//static member
			//System.out.println("data is "+ data2);
			//class 자체가 static 이기 때문에 non-static멤버를 쓸수 없다.
		}
	}
	public static void main(String[] args) {
		StaticOuter.StaticInner in = new StaticOuter.StaticInner();
		//static 내부클래스는 생성시 참조변수 = new 외부클래스이름.내부클래스 생성자 의 형태임
		in.msg();
		
	}
	

}
