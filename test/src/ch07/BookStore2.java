package ch07;

public class BookStore2 {
	private String book; // 도서명
	private String name;//저자
	private String company; //출판사
	private int year; //출판연도
	private int money; //가격
	private int num; //판매수량
	private int price;//판매금액
	
	public void input(String book, String name, String company, int year, int money, int num) {
		this.book = book;
		this.name = name;
		this.company = company;
		this.year= year;
		this.money= money;
		this.num=num;
	}
	public void calcul() {
		price = money * num;
	}
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(book +"\t"+name+"\t"+company+"\t"+year+"\t"+money+"\t"+num+"\t"+price);
	}
}
