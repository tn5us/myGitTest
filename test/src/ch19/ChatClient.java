package ch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) throws Exception {
		//클라이언트 소켓
		Socket socket = null;
		PrintWriter writer = null;
		BufferedReader reader = null;
		try {//new socket (서버의 아이피 주소, 포트번호
			socket = new Socket("127.0.0.1",5555);
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		String receive = "";
		String send;
		Scanner sc= new Scanner(System.in);
		while (true) {
			receive = reader.readLine();//메시지를 읽음
			System.out.println("[Server]: "+receive);
			if (receive.equals("quit")) break;
			System.out.println("클라이언트님 입력핫요(종료: quit):");
//			if(send.equals("quit")) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			if (send !=null) {
//				writer.println(send);//메시지 보내기
//			}
//			
		}//while
		sc.close();
		writer.close();
		reader.close();
		socket.close();
		
	}
}
