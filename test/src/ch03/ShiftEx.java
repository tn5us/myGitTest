package ch03;

public class ShiftEx {

	public static void main(String[] args) {
		int a = 2; //이진수 0010, 1111=>15
		
		int b = a<<2; //0010=>1000(십진수:8)
		System.out.println(b);
		b = b>>2; //1000=>0010(십진수2)
		System.out.println(b);
		
		

	}

}
