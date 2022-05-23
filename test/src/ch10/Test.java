package ch10;

public class Test {
	static int a; //static member 변수
	int b; //non-static member 변수
	void print() {//non-static member 메소드
		System.out.println(a);//non-static member안에서는 static멤버를 얼마든 사용가능하다.
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		System.out.println(a);
		Test t = new Test();
		System.out.println(t.b);//new를 해야만 non-static member를 쓸 수 있다.
		System.out.println(t);
		t= null;//null 하면 참조변수는 주소를 잃고 메모리에서 해당 객체가 떠돌아 다님
		System.out.println(t);
	}
	

}
