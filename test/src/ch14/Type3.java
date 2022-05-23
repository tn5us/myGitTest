package ch14;

public class Type3 <T>{//자료형이 미정인 상태
	T t;//변수도 자료형 미정

	public T getT() {
		return t;
	}
	public void setT(T t) {//자료형 미정, T = String 
		this.t = t;
	}	
	public static void main(String[] args) {
		//인스턴스를 생성할 때 자료형을 결정함. =>제너릭(일반화)이라함.
		Type3<String> t = new Type3<String>();
		t.setT("100");
		System.out.println(t.getT());
		
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getClass());
		
		Type3 t3 = new Type3();// <>자료형을 주지않고 일반적인 방법으로 new 했을땐 실행은 되지만 경고
		//내부적으로 다 Object 처리하게 되어 메모리 낭비를 심하게 함.
		t3.setT(100.5);
		t3.setT("hello"); //되긴되는데 조심해야함~!!!!
		
	}
	

}
