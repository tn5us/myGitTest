package ch12;

class Outer2{
	class InnerEx2{
		int num = 2;
		String name = "사임당";
	}
	static class StaticInner2{
		static String email = "saim@gmail.com";
	}	
	void method() {
		class LocalInner2{
			String addr = "서울시 강남구 역삼동";			
		}
		LocalInner2 l = new LocalInner2();
		System.out.println("주소: "+ l.addr);		
}
}
public class OuterEx {
	public static void main(String[] args) {
		Outer2 oc = new Outer2();
		Outer2.InnerEx2 i = oc.new InnerEx2();
		System.out.println("---------------------");
		System.out.println("고객번호: "+i.num);
		System.out.println("이름: "+i.name);
		Outer2.StaticInner2 si = new Outer2.StaticInner2();
		System.out.println("이메일: "+ si.email);
		oc.method();
		System.out.println("---------------------");
	
	
	}
}
