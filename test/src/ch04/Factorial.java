package ch04;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		long fact = 1;
		//ex)3! =1*2*3
		int n;		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		n =sc.nextInt();
		sc.close();
		
		for( int i =1; i<=n; i++) {
			fact = fact *i;			
		}
		System.out.printf("%d!은 %d입니다.", n, fact);
	}
}
