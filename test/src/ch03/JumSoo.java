package ch03;

import java.util.Scanner;

public class JumSoo {

	public static void main(String[] args) {
		String name;
		int java, html, jsp, db, tot;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("java점수 : ");
		java = scan.nextInt();
		System.out.print("html점수 : ");
		html = scan.nextInt();
		System.out.print("jsp점수 : ");
		jsp = scan.nextInt();
		System.out.print("db점수 : ");
		db = scan.nextInt();
		scan.close();
		
		tot = java + html + jsp + db;
		avg = tot/4.0;
		
		System.out.println("===================================================");
		System.out.println("이름\tjava\thtml\tJSP\tDB\t총점\t평균");
		System.out.println("---------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\n", name, java, html, jsp, db, tot, avg);
		System.out.println("===================================================");
		

	}

}
