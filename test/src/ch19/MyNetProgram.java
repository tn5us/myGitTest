package ch19;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.util.Enumeration;

public class MyNetProgram {
	public static void main(String[] args) {
		System.out.println("1)나의 랜카드 정보: ");
		try {
			Enumeration<NetworkInterface> enu = NetworkInterface.getNetworkInterfaces();
			while(enu.hasMoreElements()) {
				NetworkInterface net = enu.nextElement();				
				System.out.println(net);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("2) naver의 서버들:  ");
			InetAddress[] address = InetAddress.getAllByName("naver.com");
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			InetAddress addr = InetAddress.getByName("naver.com");
			System.out.println("3) naver.com의 호스트이름: "+ addr.getHostName());
			System.out.println("메인 IP 번호: "+ addr.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		ServerSocket socket =null;
		System.out.println("4)나의 사용 port 번호들: ");
		for(int i=0; i<=65535; i++) {
			try {
				socket = new ServerSocket(i);
				socket.close();
			}catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");
			}
		}
		
		
	}
}
