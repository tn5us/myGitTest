package ch05;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		int total = 0;
		int size = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하시오: ");
		size = scan.nextInt();
		int [] scores = new int [size]; //변수로 배열의 크기를 지정할 수 있다.
		for (int i=0; i<scores.length; i++) {
			System.out.println("성적을 입력하세요: ");
			scores[i]= scan.nextInt(); //size 크기만큼 반복하겠지
		
			//스캐너를 활용하여 배열의 사이즈를 변수화 해서 처리할수 있다 
		}
		
		for (int i=0; i<scores.length; i++) {
			total += scores[i];
			
		}
		System.out.println("평균성적은 "+total/scores.length+"입니다.");
	}
}
