package ch06;

public class ReturnEx2 {
	public static void main(String[] args) {
		printScore(120);
		
	}

	public static void printScore(int score) {
		if(score <= 0 || score>=100) {
			System.out.println("잘못된 점수: " +score);
			return;// 리턴이 있는 위치가 메소드 종료자리,, break 같은 역할을 한다./ return없으면 밑에꺼도 실행
		}
		System.out.println("점수: "+ score);
		
	}
}
