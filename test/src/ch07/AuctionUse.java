package ch07;

public class AuctionUse {
	public static void main(String[] args) {
		Auction a1 = new Auction() ;// 클래스 내의 기본생성자 호출
		a1.setName("홍길동");
		a1.setUserid("honggildong");
		a1.setMoney(150000);
		a1.print();
	}
}
