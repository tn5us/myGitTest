package ch02;

public class Box {
	
	//사각형의 넓이, 둘레를 구하는 프로그램
	//가로 10.0, 세로 5.0
	//넓이 가로*세로
	public static void main(String[] args) {
		double width; //가로
		double hight; //세로
		double area;  //넓이
		double perimeter; //둘레값
		
		width = 10.0; //값을 초기화(할당)
		hight = 5.0;
		area = width * hight;//넓이
		perimeter = 2.0*(width + hight);
		System.out.println("사각형의 넓이: "+ area); 
		//여기서의 +기호는 연결연산자로서 좌,우의 문자또는 값을 연결만 해준다
		System.out.println("사격형의 둘레: " +perimeter);
		
}
}
