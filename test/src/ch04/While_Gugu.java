package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		int dan;
		int j=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하세요: ");
		dan = sc.nextInt();
		sc.close();
				
		while (j<=9) {
			System.out.println("** "+dan+"단 **");
			while(j<=9) {
				System.out.println(dan + " x "+ j+ " = "+dan*j);
				j++;				
			}
		}
	}
}