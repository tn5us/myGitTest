package ch07;

public class PointUse {
	public static void main(String[] args) {
		Point p1 = new Point();//point 클래스의 객체(인스턴스)생성
		//데이터 처리 
		p1.setName("홍길동");
		p1.setKor(90);
		p1.setEng(80);
		p1.setMat(89);
		//출력
		p1.print();
		
	}
}
