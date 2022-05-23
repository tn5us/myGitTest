package ch05;

public class StringArray2 {
	public static void main(String[] args) {
		String[] str = {"Java","DB","JSP","Spring"};
		for( int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		//위의 것과 같은데 실무에서 더 많이 쓰임
		//for each문 (향상된 for문)
		//for(데이터 타입 개별값 저장변수: 집합변수)
		//++가 내부적으로 작동되는 메카니즘
		for (String ss: str) { 						
			System.out.println(ss);
		}
	}
}
