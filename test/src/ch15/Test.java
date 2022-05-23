package ch15;

public class Test {
	public static void main(String[] args) {
		//try catch로 잡아봐
		try {
			int num = Integer.parseInt("ABC");//영문자를 숫자화 할 수 없다
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat 예외발생");
//			e.printStackTrace();
		}
		
		
	}
}
