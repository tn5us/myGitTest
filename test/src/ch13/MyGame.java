package ch13;
import java.util.Random;
import java.util.Scanner;
public class MyGame {
	public static void main(String[] args) {		
		Random r = new Random();
		String[] gg = {"가위","바위", "보"};
		String kk = gg[r.nextInt(3)];		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("가위, 바위, 보 중 하나를 입력하세요: (exit를 누르면 종료됩니다.)");
			String str = scan.next();
		if (str.equals("가위")) {
			if (kk.equals("바위")) {
				System.out.println("지셨습니다.컴퓨터는 "+kk+" 입니다.");
			}else if (kk.equals("보")) {
				System.out.println("이기셨습니다.컴퓨터는 "+kk+" 입니다.");
			}else {
				System.out.println("비겼습니다.");
			}			
		}else if (str.equals("바위")) {
			if (kk.equals("바위")) {
				System.out.println("비겼습니다.");
			}else if (kk.equals("보")) {
				System.out.println("지셨습니다.컴퓨터는 "+kk+" 입니다.");
			}else {
				System.out.println("이기셨습니다.컴퓨터는 "+kk+" 입니다.");
			}
		}else if (str.equals("보")) {
			if (kk.equals("바위")) {
				System.out.println("이기셨습니다.컴퓨터는 "+kk+" 입니다.");
			}else if (kk.equals("보")) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("지셨습니다.컴퓨터는 "+kk+" 입니다.");
			}
		}else if (str.equals("exit")) {
			System.out.println("Game Exit");
			break;
		}	
		}
			
		
		
	}
}
