package ch06;

public class OverloadEx1 {
	public static void main(String[] args) {
		print(10.5); //실수형 3번 찾아감
		print("hello");//문자열 1번 찾아감
		print(100); //정수형 4번
		print("Hi","Java");//문자열 2번
	}
	//1
	static void print(String b) {
		System.out.println(b);
		
	
	}
	//2
	static void print(String a,String b) {
		System.out.println(a);
		System.out.println(b);
	}
	//3
	static void print(double a) {
		System.out.println(a);
	}
	//4
	static void print (int c) {
		System.out.println(c);
	}

}
