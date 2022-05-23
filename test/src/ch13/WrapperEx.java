package ch13;

//Wrapper class : 기본자료형을 포장하는 클래스
//기본자료형에 대한 다양한 method를 지원
//byte - Byte
//short - Short
//int - Integer
//float - Float
//double- Double
//char- Character
//boolean - Boolean
public class WrapperEx {
	public static void main(String[] args) {//객체타입과 기본타입 왔다갔다
		Integer i1 = 10; 
		Integer i2 = new Integer(20); //auto boxing(랩핑을 씌움)
		int num1 = i1.intValue();//intValue는 명시적으로 적어도 되고 안적어도 되고 
		int num2 = i2;// auto unboxing (객체로 포장된 value를 꺼내는 작업intValue())
		int sum= num1+num2;
		System.out.println(sum);
		//2진수로 변환
		System.out.println(Integer.toBinaryString(sum));
		//8진수로 변환
		System.out.println(Integer.toOctalString(sum));
		//16진수로 변환
		System.out.println(Integer.toHexString(sum));
		System.out.println(Integer.MAX_VALUE);//정수의 최대값
		System.out.println(Integer.MIN_VALUE);//정수의 최소값
		System.out.println(Integer.parseInt("100"));//문자열을 숫자로 변환(가장 많이쓸것임)
		//정수를 문자열로 변환
		System.out.println(Integer.toString(100));//100-> "100"
		System.out.println(100+"");//문자열100으로 변환
	}

}
