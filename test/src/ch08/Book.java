package ch08;

public class Book { //도서판매정보 프로그램
	//멤버변수
	private String bookName;
	private String author;
	private String press;
	private int year;
	private int price;
	private int amount;
	private int money;//판매금액(단가 *판매수량)
	
	public Book() {//기본생성자
		this("자바","김선생","한빛",2020,20000,10);//다른생성자 호출시 this() 첫줄!!!!
		System.out.println("기본생성자 호출");
	}

	public Book(String bookName, String author, String press, int year, int price, int amount) {//void 쓰면 안됨
		System.out.println("매개변수가 있는 생성자 호출");
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price*amount;
	}
	
	public void input(String bookName, String author, String press, int year, int price, int amount) {
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price*amount;
	}
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"+amount+"\t"+money);
	}
	
	
	
}
