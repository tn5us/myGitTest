package ch05;

import java.util.Scanner;

public class ArrayScanScore1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		
		int size =scan.nextInt();
		int score[] = new int [size];
		int sum =0;
		double avg = 0;
		
		//입력
		for (int i=0; i<score.length;i++) {
			System.out.print("성적을 입력하세요");
			score[i]=scan.nextInt();
			
		}
		//총점, 평균
		for (int value : score) {
			sum =+ value;
		}
		avg =(double)sum/score.length;
		System.out.println("총점은 "+sum +"점 입니다.");
		System.out.println("평균은 "+String.format("%.1f", avg)+"점입니다.");
	}
}
