package ch05;

import java.util.Scanner;

public class ArrayScanScore {
	public static void main(String[] args) {
	int num = 0;
	int tot= 0;
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("성적처리할 학생수를 입력하세요> ");
	num = scanner.nextInt();
	
	int [] score = new int [num];
	for(int i=0; i<score.length; i++) {
		System.out.print("성적을 입력하세요. ");
		score[i]= scanner.nextInt();
	}
	for (int i=0; i<score.length; i++) {
		tot += score[i];
	}
	System.out.println("총점은 "+ tot+"입니다.");
	System.out.println("평균성적은 "+String.format("%.1f", (double)tot/num)+"입니다.");
	}
}
