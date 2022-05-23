package ch02;

public class CahrEx {
	//유니코드
	//https://huskdoll.tistory.com/39
	public static void main(String[] args) {
		char aValue = '\u0041';
		System.out.println("char형('\u0041'):" +aValue);
		char bValue = '\u0041';
		System.out.println("char형(\'\\u0041\'):" +aValue);
		//유니코드 그대로 보이게 하려면 역슬래시 이용
		
	}
}
