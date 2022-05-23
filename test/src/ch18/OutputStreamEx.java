package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		//콘솔창에 별도의 스트림 값을 출력하기 위해 system 클래스의 out 이라는 static 멤버에
		//printStream 객체 참조 값이 들어있는 점을 활용.
		PrintStream ps = System.out;
		OutputStream os = ps;//printStream 객체를 부모타입인 outputStream으로 받아 처리한다.
		//OutputStream 도 1byte 처리 스트림이다. 따라서 한글은 지원이 안된다.
		
		try {
			os.write(97);//a를 뜻함
			os.write(98);//b
			os.write(99);//c
			os.flush();//flush()메소드를 써야 출력까지 된다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
