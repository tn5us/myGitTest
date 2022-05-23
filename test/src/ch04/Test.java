package ch04;

public class Test {
		public static void main(String[] args) {
			for(int i=1; i<=5; i++) {
				for(int j=5; j>0; j--) {
					if(i<j ) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}//else
				}//inner for
				System.out.println("");
			}//outer for
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=5; j--) {
					if(i>j) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}//main
	}

