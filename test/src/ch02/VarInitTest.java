package ch02;

public class VarInitTest {

	public static void main(String[] args) {
		int index =20; //지역변수 선언만
		//지역변수는 반드시 초기화(값을할당,저장)를 해야한다. 선언만한 상태에서는 에러가 난다.
		index = index + 1;
		System.out.println("index : "+index);

	}

}
