package ch06;

public class StudentPoint {
	//전역변수
	static int [] num = {1001,1002,1003}; //학번
	static String [] name = {"홍길동","이몽룡","이순신"};//이름
	static int [] kor = {80, 90, 100};
	static int [] eng = {90, 70, 80};
	static int [] mat = {83, 80, 87};
	static int [] tot = {0,0,0};
	static double [] avg = {0,0,0};
	
	static void students() {
		System.out.println("전체 학생수 :" + num.length);
	}
	
	static void getTot() { //총점계산
		for(int i=0; i<3; i++) {
			tot[i] = kor[i]+ eng[i]+ mat[i];
		}
	}
	static void getAvg() {//평균계산
		for(int i=0; i<3; i++) {
			avg[i] =tot[i]/3.0;			
		}
	}
	static void print() {
		System.out.println("------------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------");
		for(int i=0; i<3; i++) {
			System.out.println(num[i]+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));			
		}
		System.out.println("------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		students();
		getTot();
		getAvg();
		print();
		
	}
	
}
