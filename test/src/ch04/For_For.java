package ch04;
public class For_For {
	public static void main(String[] args) {
		//중첩for문
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=10; j++) {
				System.out.print("*");			
			}//inner for
			System.out.println();
		}//outer for		
	}//main
}
//바깥쪽 for문은 5줄에 관여, 안쪽은 별10개에 관여
//안쪽 만족 후 바깥쪽 for 문으로 나감