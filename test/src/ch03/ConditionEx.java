package ch03;

public class ConditionEx {
	public static void main(String[] args) {
		int num = -5;
//		System.out.println(num > 0 ? num : -num); //false 이므로 -num = 5
		
		
		if(num>0) { //if 제어문 true
			System.out.println(num);
		}else { //false
			System.out.println(-num);
		}
		
	}
}
