package ch05;

public class Array2Point2 {
	public static void main(String[] args) {
		int [][] point ={
				{80,90,100},
				{70,60,98},
				{88,88,44},
				{99,88,77},
				{77,48,68}
				};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<point.length; i++) {
			int sum =0;// 총점
			float avg=0.0f;//평균
			
			System.out.printf("%d\t", i+1);// 번호 출력
			for(int j=0; j<point.length; j++) {
				sum += point[i][j];
				System.out.printf("%d\t", point[i][j]);
			}//inner for
			
			avg = (float)sum/point[i].length; //평균계산
			System.out.printf("%d\t %.1f%n", sum, avg);					
		}				
		}
	}

