package ch06;

public class ReturnExam {
	
	public static int sum(int a) { //a=50, a=100
		int result =0;
		for (int i=0; i<=a; i++) {
			result = result +i;
		}
		return result; //메소드를 호출한 곳으로 값을 반환함
	}
		
	public static void main(String[] args) {
		int n =sum (50);
		System.out.println(n);
		n=sum(100);//메소드 재사용
		System.out.println(n);
	}
}
