package ch05;

public class GetMin {
	public static void main(String[] args) {
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		int minimum;
		
		minimum = s[0]; //minimum=12
		for (int i=1; i<s.length; i++) { //인덱스 1번이 필요하기 때문에 i=1, 0은 이미 초기값으로 세팅해서..
			if(s[i]< minimum) {
				minimum = s[i];
			}
						
		}
		System.out.println("최소값은 " + minimum);
		
	}
}
