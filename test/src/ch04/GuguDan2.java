package ch04;
public class GuguDan2 {
	public static void main(String[] args) {
		for(int dan=2; dan<+9; dan++) {
			System.out.println();
			System.out.println("**" +dan +" 단**");
			for (int n=1; n<=9; n++) {//변수는 서로 달라야한다
				System.out.println(dan + " x " + n + " = " + dan*n);				
			}
		}
	}
}
