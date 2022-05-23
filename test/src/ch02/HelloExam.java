package ch02;

public class HelloExam {//클래스의 이름은 반드시 대문자로 시작(중요)
	//메소드의 이름은 반드시 소문자로 시작(중요)
	public static int sum(int n, int m) { //n=20, m=10
		return n + m; //return은 결과값을 호출한 쪽으로 반환한다.
	}

	public static void main(String[] args) {
		int i = 20;
		int s; //지역변수를 선언만 한 상태
		char a;
		
		//변수 이름도 소문자로 시작(중요)
		//매개변수의 숫자가 같아야하고, int면 같은 타입을 호출해야함
		s = sum(i, 10); //s=30
		a = '?'; //단문자는 작은 따옴표
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		
		
	}
	
}
