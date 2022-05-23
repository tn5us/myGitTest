package ch02;

public class NameUnicode {

	public static void main(String[] args) {
		char a = '\uAE40';
		char b = '\uC218';
		char c = '\uD604';		
				
	System.out.println("=====================");
	System.out.println("김 수 현");
	System.out.println("---------------------");
	System.out.println("char형(\'\\uAE40\'):" + a);
	System.out.println("char형(\'\\uC218\'):" + b);
	System.out.println("char형(\'\\uD604\'):" + c);
	System.out.println("=====================");
	}

}
