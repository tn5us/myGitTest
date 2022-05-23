package ch10;

public class StaticVarUse {
	public static void main(String[] args) {
		//다른객체에서 static 멤버를 사용할때는 "클래스이름.static멤버"로 사용
		System.out.println(StaticVar.a);
	}
}
