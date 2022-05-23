package ch03;

public class SignImcrementEx {
	public static void main(String[] args) {
		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("PlusOne은 " + plusOne + "입니다.");
		System.out.println("minusOne은 " + minusOne + "입니다.");
		
		int x = 1, y = 1;
		System.out.println("x = "+ x +", ++x = "+ ++x);//계산 먼저 해서 보여줌(전의연산?
		System.out.println("y = "+ y +", y++ = "+ y++);//기억된걸 다음줄에 출력해줌,,(후의연산?
		System.out.println("y = "+ x +", y = "+ y);
		
		
		
	}
}
