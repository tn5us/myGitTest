package ch03;

public class CastEx {
	public static void main(String[] args) {
		//자료형 변환
		float f = 1.6f;//float은 f를 꼭 써줘야지!!!!  4바이트로 저장
		System.out.println(f);
		
		f = 100; // int 형인 100이라는 정수값을 float형인 f가 자동으로 100.0으로 만든다
		//이러한 변환을 자동형변환(확장형)이라한다. 정수가 실수보다 더 작기 때문에 문제없음
		System.out.println(f);
		
		
		f= 100.5f; //실수라는 큰 그릇을 작은 정수그릇에 넣으려면 자동으로 안되고 강제형변환을 개발자가 명시적으로 해야함
		int i = (int)f;
		System.out.println(i);
	}
}
