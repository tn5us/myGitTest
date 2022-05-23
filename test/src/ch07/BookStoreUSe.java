package ch07;

public class BookStoreUSe {
	public static void main(String[] args) {
		BookStore bs = new BookStore();
		bs.setBook("Java");
		bs.setName("김선생");
		bs.setCompany("영진");
		bs.setYear(2022);
		bs.setMoney(30000);
		bs.setNum(10);
		bs.print();
	}
}
