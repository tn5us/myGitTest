package ch02;

public class PrintfEx {
	public static void main(String[] args) {
		int i = 97;
		int d = 3000;
		String s = "Java";
		double f = 3.14;
		
		
		System.out.printf("%d\n", i);
		System.out.printf("%o\n", i);
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i);
		System.out.printf("%5d\n", d); //다섯자리 왼쪽 공백처리
		System.out.printf("%-5d\n", d); //오른쪽에 공백처리
		System.out.printf("%,d\n", d);//3자리마다 콤마
		System.out.printf("%s\n", s);
		System.out.printf("%5s\n", s); //오른쪽 정렬
		System.out.printf("%-5s\n", s); //왼쪽 정렬
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%4.1f\n", f); //자리수 4자리 소수점 첫째까지
		System.out.println(String.format("%4.1f", f));
		System.out.printf("%.1f\n", f);//전체자리수는 정하지 않고 소수점 첫째자리까지만 지정하는 방식		
		System.out.printf("%07.1f\n", f); //공백에 0 (7자리수)
		System.out.printf("%-4.1f\n", f);
		
		int a= 3, b = 5;
		//%를 표현하고자 할때는 a%%b 처럼 2개를 쓴다
		System.out.printf("a%%b=%d\n", a%b);
		
		
	}
}
