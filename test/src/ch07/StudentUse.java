package ch07;

public class StudentUse {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setYear(4);
		s1.setMajor("컴공");
		s1.setNum("a1234");
		s1.setPoint(4.1);
		s1.setMoney(400);
		s1.print();
	}
}
