package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DateClient {
	public static void main(String[] args) throws Exception {
		//new Socket("ip주소",포트번호);
		//localhost(내 아이피) =127.0.0.1
		Socket s= new Socket("localhost",8000);
		//서버에서 accept() 하면 통신가능상태로 들어감
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//서버에서 보낸 메시지를 받음
		String res = input.readLine();
		System.out.println(res);
		s.close();
		System.exit(0);		
	}
}
