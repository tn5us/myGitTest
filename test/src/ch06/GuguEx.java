package ch06;

import java.util.Scanner;

public class GuguEx {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("출력할 구구단을 입력하세요.");
		int n = scan.nextInt();
		
		System.out.println("==첫번째 메소드 활용==");
		gugu(n);
		System.out.println("==두번째 메소드 활용==");
		guguAll(n);
		
		
	}

	public static void gugu(int a) {
		for (int i=1; i<=9; i++) {			
			System.out.println(a+" x "+ i + " = "+ a*i);			
		}
	}
	public static void guguAll(int a) {
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.println(i+" x "+ j + " = "+ i*j);
			}
		}
	}
	
}
