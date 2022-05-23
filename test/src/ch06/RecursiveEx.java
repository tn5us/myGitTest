package ch06;
//재귀호출 : 팩토리얼계산시 활용, 실제 잘 사용 안함(메모리 증가가 너무 심함)
public class RecursiveEx {
	public static void main(String[] args) {
		System.out.println(fact1(15));//5!=5*4*3*2*1
	}

	static long fact1(int n) {		
		return n==1?1:n*fact1(n-1);
	}
	//큰 수를 다룰때는 BigInteger를 사용하거나 배열을 사용
}
