package ch04;

import java.util.Scanner;

public class ControlEx {
	public static void main(String[] args) {
		int menu =0;
		int num =0;
		Scanner sc= new Scanner(System.in);
		
		outer: //라벨처리
		while(true) {
			System.out.println("(1) square(제곱)");
			System.out.println("(2) square root(제곱근)");
			System.out.println("(3) log(로그)");
			System.out.println("원하는 메뉴(1~3)를 선택하세요 (종료는 0)> ");
			String tmp =sc.next();
			menu= Integer.parseInt(tmp);
			if(menu ==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}else if (menu <1 || menu >3) {
				System.out.println("메뉴를 잘못선택하셨습니다. (종료는 0)");
				continue;
				
			}
			for (;;) { //for문에서 (;;)는 무한루프
				System.out.println("계산할 값을 입력하세요.(계산종료: 0, 전체종료: 99)");
				tmp = sc.next();
				num = Integer.parseInt(tmp);
				if (num==0) break;
				
				if (num==99) break outer; //전체종료
				
				switch(menu) {
				case 1:
					System.out.println("result="+ num*num);//제곱
					break;
				case 2:
					System.out.println("result=" + Math.sqrt(num));//제곱근
					break;
				case 3:
					System.out.println("result=" + Math.log(num));//로그값
					break;						
				}//switch								
			}//end for(;;)
		}//end while
		System.out.println("프로그램을 모두 종료합니다.");
	}//main
}
