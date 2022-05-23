package ch05;

public class ArrayString {
	public static void main(String[] args) {
		String[] str= {"Java","DB","JSP","HTML"};
		for (int i =0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		//확장 for문(향상된 for문)==> java1.5 부터 사용가능
		
		for (String ss : str) {//ss는 개별변수: str은 집합변수
			System.out.println(ss);
		}
	}
}
