package ch06;

public class PointEx {
//멤버변수(전역)
	static String[] name = {"박길동", "강감찬","사임당","이순신","홍길동"};
	static int [] kor = {100,99,88,77,66};
	static int [] eng = {100,100,88,77,100};
	static int [] mat = {100,99,88,100,66};
	static int [] tot = {0,0,0,0,0};
	static double [] avg  = {0.0,0.0,0.0,0.0,0.0};
	
	static void getTot() {//총점 계산용도
		for(int i=0; i<5; i++) {
			tot[i]= kor[i]+ eng[i]+ mat[i];			
		}
	}
	static void getAvg() {//평균 계산 용도
		for(int i=0; i<5; i++) {
			avg[i] = tot[i]/3.0;
		}
		}	
	static void print() {//결과 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
		
	}
	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
	}
}

