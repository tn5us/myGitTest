package ch08;

public class BookUse {
	public static void main(String[] args) {
		Book b = new Book("Java", "홍길동", "영진", 2017, 35000, 5);
		b.input("DB", "아무개", "한빛", 2021, 25000, 3);//덮어써짐..
		b.print();
		
		Book b1 = new Book();
		b1.print();
		
		
	}
}
