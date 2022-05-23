package ch12;

public class OuterClass {
	//OuterClass의 static 멤버변수
	private static int x = 10;
	class Inner{//inner class
		int getX() {
			return x;//outer 클래스의 private변수도 쓸 수 있다.
		}
	}//end inner 
	
	public static void main(String[] args) {
		System.out.println(x);//static 이라서 그냥 쓸수 있음
		OuterClass e = new OuterClass();
		OuterClass.Inner in = e.new Inner();
		System.out.println(in.getX());
		
		
	}
	
	
}
