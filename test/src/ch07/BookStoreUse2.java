package ch07;

public class BookStoreUse2 {
	public static void main(String[] args) {
		BookStore2 bs2 = new BookStore2();
		bs2.input("Java", "김선생", "영진", 2022, 30000, 10);
		bs2.calcul();
		bs2.print();
	}
}
