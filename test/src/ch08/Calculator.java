package ch08;

public class Calculator {
	//멤버변수
	private int left;
	private int right;
	//생성자를 만들때 기본생성자를 함꼐 만드는 습관을 들인다.
	//한개라도 user가 define한 생성자가 만들어지면 더이상 컴파일러는
	//기본생성자를 자동으로 만들지 않기 때문에
	
	//기본생성자
	public Calculator() {
		System.out.println("기본생성자 호출...");
	}
	public Calculator(int left, int right) {
		//다른 메소드를 개발자가 만져놓으면 기본생성자를 알아서 생성 안해줌
		System.out.println("매개변수가 있는 생성자 호출...");
		this.left=left;
		this.right = right;		
	}
	//getter, setter
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left + right);
	}
	public void avg() {
		System.out.println((left +right)/2);
	}
}
