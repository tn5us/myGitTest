package ch06;

import java.util.Scanner;

public class HolidayEx {
	static int y; //전역변수, 멤버변수(클래스 전체에서 사용할수 있는 변수 ) 
	
	static void input() {//입력용 메소드
		Scanner scan = new Scanner(System.in);
		System.out.println("근속연수를 입력하세요: ");
		y = scan.nextInt();
		scan.close();		
	}
	
	static int holiday(int year) {
			
		int day=0; //day는 지역변수(로컬변수)로 메소드 내에서만 사용가능
		if(year<=5) {//근속년수 1~5년
			day =10;//10일 휴가
			
		}else if (year<=10) {
			day=15;
		}else {
			day = 20;
		}
		return day;
		
	}
		
	
	public static void main(String[] args) {
		input();
		System.out.println("휴가일수 : "+ holiday(y));
		
	}
}
