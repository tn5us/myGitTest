package ch14;

public class Box {
	//멤버변수
	private Object data;
	public void set(Object data) {//Object 는 편하지만 시스템 부담
		this.data = data;//지역변수로 초기화		
	}
	public Object get() {//리턴타입이 Object
		return data;
				
	}
	public static void main(String[] args) {
		Box b = new Box();
		b.set("Hello World");//오브젝트로 받기 때문에 모든 타입 가능
		String s = (String)b.get();//String = Object (x)따라서 형변환 해줘야지
		Box c = new Box();
		c.set(30);
		Integer i =(Integer)c.get();//class 객체 = Object(조상객체)(x) 
		System.out.println(s);
		System.out.println(i);
		
	}
}
