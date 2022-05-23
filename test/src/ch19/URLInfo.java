package ch19;

import java.net.URL;

public class URLInfo {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://isplus.joins.com/2022/05/20/enter/entertainment/20220520154027926.html");
			System.out.println("프로토콜: "+url.getProtocol());
			System.out.println("포트:"+ url.getPort());
			System.out.println("호스트: "+ url.getHost());
			System.out.println("파일: "+url.getFile());
			System.out.println("기타: "+ url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
