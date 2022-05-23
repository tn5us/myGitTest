package ch07;

public class BookStore {
	private String book; // 도서명
	private String name;//저자
	private String company; //출판사
	private int year; //출판연도
	private int money; //가격
	private int num; //판매수량
	private int price;//판매금액
	
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPrice() {
		price = money * num;
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(book +"\t"+name+"\t"+company+"\t"+year+"\t"+money+"\t"+num+"\t"+getPrice());
	}
	
}
