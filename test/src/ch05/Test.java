package ch05;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int s[]= {0,10,20,30,40,50,60,70,80,90,100};
		int value, index =1;
		Scanner scan = new Scanner(System.in);
		System.out.println("(보기: 0 10 20 30 40 50 60 70 80 90 100)");
		System.out.println("위 숫자 중 탐색할 값을 입력하세요");
		value = scan.nextInt();
		for (int i=0; i<s.length; i++) {
			if (value == s[i]) {
				index = i;
			}
			
		}
		if (index<s.length)
		System.out.println(value+"값은"+index+"위치에 있습니다.");
	}
}