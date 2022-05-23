package ch04;

public class Char_Tower {

	public static void main(String[] args) {
		int i, j;
		char a =65;//65는 아스키코드로 'A'
		for(i=1; i<5; i++) { //4번 반복
			for(j=1; j<=i; j++) {
				System.out.print(a++);//65,65, 67로 카운팅이 됨..ABC...
			}
			System.out.println();
		}
	}

}
