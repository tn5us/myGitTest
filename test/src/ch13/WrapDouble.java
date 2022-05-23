package ch13;

public class WrapDouble {
	public static void main(String[] args) {
		Double num1 = new Double("11.5");//따옴표 써도 가능
		double num2 = 3.5;//기본자료형
		double num3 = num1/num2; 
		//num1은 객체타입이고, num2는 기본타입인데 이 안에서 auto unboxing이 일어나기 때문에 가능하다.
		System.out.println(num3);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		String str = "11.5";
		System.out.println(str +200);//11.5200
		System.out.println(Double.parseDouble(str)+200);//211.5					
	}
}
