package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0; //학생수
		int sum =0;
		float avg=0.0f;
		char grade =' ';
			
		System.out.println("학생수를 입력하세요.> ");
		num = scan.nextInt();
		System.out.println("국, 영, 수 점수를 각각 입력하세요.> ");		
		int [][] score = new int [num][3];	
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"번 학생의 점수: ");
			for(int j=0; j<3; j++) {				
				score[i][j]= scan.nextInt();
				
			}
		}//출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i =0; i<score.length; i++) {
			System.out.printf("%d\t",i+1); //번호출력
				for(int j=0; j<score[i].length; j++) {	// 국영수 배열값 출력				
					System.out.printf("%d\t",score[i][j]);
			}
				sum = score[i][0]+score[i][1]+score[i][2]; //sum +=score[i][j] 요렇게 해도 된다는디./ 난 왜 안된겨
				avg = (float)sum/score[i].length;
				
				if(avg>=90) {
					grade = 'A';
				}else if (avg>=80) {
					grade = 'B';
				}else if (avg>=70) {
					grade = 'C';
				}else if (avg>=60) {
					grade = 'D';
				}else {
					grade = 'F';
				}				
				System.out.printf("%d\t%.1f\t%s%n",sum, avg,grade);														
			}										
	}	
}
			
	