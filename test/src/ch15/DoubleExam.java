package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleExam {
	//예외가 2개 이상 함께 발생할 경우: 세부적인 예외 부터 처리
	public static void main(String[] args) {
		int num = 50;
		Scanner scan = null;
		
		try {
			System.out.println("숫자를 입력하세요: ");
			scan = new Scanner(System.in);
			int value = scan.nextInt();
			System.out.println(num/value);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 나눌 수 없습니다.");
		}catch (InputMismatchException e) {
			System.out.println("정수만 입력할 수 있습니다.");
		}catch (NullPointerException e) {
			System.out.println("널포인터 예외");
		}catch (Exception e) {
			System.out.println("기타 예외");
		}finally {//예외발생 여부에 관계없이 항상 실행되는 코드 (필수코드는 아님)
			if(scan != null) {
				scan.close();
			}
		}
		System.out.println("프로그램 종료");
		
	}
}
