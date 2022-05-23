package ch05;

public class Array2Point {
	public static void main(String[] args) {
		//5행 5열( 국,영, 수, 총점, 평균)
//		int [][] point = {
//				{80,90,100,0,0},
//				{70,60,98,0,0},
//				{88,88,44,0,0},
//				{99,88,77,0,0},
//				{77,48,68,0,0}
//				};
		int [][] point; //배열 참조변수 선언
		point = new int [5][5];
		point[0][0] = 80;
		point[0][1] = 90;
		point[0][2] = 100;
		point[1][0] = 70;
		point[1][1] = 60;
		point[1][2] = 98;
		point[2][0] = 88;
		point[2][1] = 88;
		point[2][2] = 44;
		point[3][0] = 99;
		point[3][1] = 88;
		point[3][2] = 77;
		point[4][0] = 77;
		point[4][1] = 48;
		point[4][2] = 68;
					
		for (int i=0; i<5;i++) {
			point[i][3] = point[i][0] +point[i][1]+point[i][2]; //총점 구하기
			point[i][4] = point[i][3]/3;
						
		}
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for (int i=0; i<5; i++) {
			System.out.println(point[i][0]+"\t"+point[i][1]+"\t"+point[i][2]+"\t"+point[i][3]+"\t"+point[i][4]);
		}
	}
}
