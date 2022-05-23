package ch05;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[] numbers = {10,20,30};
		//for문으로 데이터 출력
		for( int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int ss: numbers) { //집합변수는 내가 사용하는 배열로 써야함
			System.out.println(ss);
		}
	}
}
