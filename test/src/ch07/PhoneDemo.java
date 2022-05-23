package ch07;
class phone{//멤버변수
	String model; //갤럭시 s21 번지수 아이폰 번지수 따로 있음 (변수처럼 값이 계속 바뀌는 것이 아님)
	int value;
	//멤버 메소드
	void print() {
		System.out.println(value +"만원 짜리 "+ model +"스마트폰");
		
	}
}

public class PhoneDemo {
	public static void main(String[] args) {
		phone myphone = new phone();
		myphone.model = "갤럭시 S21";
		myphone.value =100;
		myphone.print();
		
		phone yourphone = new phone();
		yourphone.model = "아이폰";
		yourphone.value = 150;
		yourphone.print();
	}
	
}