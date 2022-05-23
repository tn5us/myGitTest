package ch06;

import java.util.Scanner;

public class Method_Gugu {
	
	static void gugu (int dan) {
		for (int i=1; i<=9; i++) {
			System.out.println(dan + " x " + i+ " = "+ dan*i);			
		}
	}
	static void gugu (int dan, int a) { //오버로딩 이름 같아도 매개변수수 에 맞는 걸로 알아서 찾아감
		for (int i=1; i<=9; i++) {
			System.out.println(dan + " x " + i+ " = "+ dan*i);			
		}
	}
	static void gugu (int dan, int a, int b) {
		for (int i=1; i<=9; i++) {
			System.out.println(dan + " x " + i+ " = "+ dan*i);			
		}
	}
	
					
	public static void main(String[] args) {
		int dan;
		System.out.print("단을 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		dan = scan.nextInt();
		gugu(dan);
		scan.close();
	}
}
