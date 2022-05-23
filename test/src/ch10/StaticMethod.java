package ch10;

public class StaticMethod {
	static int a =10;//static 멤법
	int b = 20;//non-static 멤버
	
	public static void printA() {//static 멤버 메소드
		System.out.println(a);
		
		//System.out.println(b); //static 멤버 메소드안에서는 non-static 멤버변수 쓸 수 없다.
		StaticMethod m = new StaticMethod();
		System.out.println(m.b); //non-static 멤버는 new 를 통해 인스턴스화 한 후 접근가능				
	}
	public void printB() {//non-static 멤버메소드 
		System.out.println(a);//static도 가능
		System.out.println(b);//논스태틱은 당연히 쓸수있지
		
	}
	public static void main(String[] args) {//main 메소드는 static 멤버
		printA();
		//printB();//static 멤버 안에는 non-static 멤보를 그냥 쓸 수 없다.
		StaticMethod a = new StaticMethod();
		a.printB(); //non-static 멤버는 반드시 new를 통해 객체화한 후 사용가능
		
		
	}
	
}
