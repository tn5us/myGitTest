package ch04;
//휴가일수 계산
//근속연수1~3년 ==>3일, 4~9년 ==>5일, 10년이상 ==>10일, 20년이상 ==>20일
import java.util.Scanner;
public class Holiday {
	public static void main(String[] args) {
		//변수선언
		int year; //근속연수
		int days; //휴가일수
		//데이터 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("근속연수를 입력하세요 : ");
		year = scan.nextInt();
		scan.close();
		
		//계산
		if (year <=3) {
			days =3;
		}else if(year <10) {
			days = 5;
		}else if(year <20) {
			days = 10;
		}else { //그외의 모든경우
			days = 20;
		}		
		//출력
		System.out.println("당신의 근속연수는 "+ year +"년이고 ");
		System.out.println("휴가일수는 " +days+"일 입니다.");
	}
}
