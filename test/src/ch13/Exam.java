package ch13;

public class Exam{
	public static void main(String[] args) {
		String a = "hello"; //메모리상에는 String Pool 영역에서 다루어짐
		System.out.println(System.identityHashCode(a));
		String b = "hello";
		System.out.println(System.identityHashCode(b));
		//String Pool 영역안의 문자열을 다룰때는 같은 문자열이 있으면 참조변수가 
		//다르더라도 같은 주소값을 가리킨다.
		System.out.println(a==b);//"=="는 주소값 비교,,주소값이 같으므로 true
		
		String c = new String("hello");//new하면 heap영역의 새로운 주소값을 가짐
		System.out.println(System.identityHashCode(c));
		String d = new String("hello");
		System.out.println(System.identityHashCode(d));
		System.out.println(c==d);//주쇼값비교: 주소값 다르므로 false
		System.out.println(c.equals(d));//내용비교 내용이 같으면 true
	}
}
