package ch19;

import java.net.InetAddress;

public class InerAddressExam {
	public static void main(String[] args) {
		try {//네트워트 프로그램도 예외처리 필수
			InetAddress address = InetAddress.getByName("google.com");
			System.out.println(address);//호스트이름, ip주소
			System.out.println(address.getHostName());//호스트이름(도메인이름)
			System.out.println(address.getHostAddress());//ip 주소			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
