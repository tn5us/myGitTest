package ch13;

public class ObjEx extends Object {
	public static void main(String[] args) {
		ObjEx e1= new ObjEx();
		System.out.println(e1.getClass());//클래스의 정보
		System.out.println(e1);//객체의 주소값
		System.out.println(e1.toString());//toString()은 Object를 문자열로 변환해서 표시
		
	}
}
