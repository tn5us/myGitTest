package ch16;

public class ThreadExam2 {
	public static void main(String[] args) {
		MyThread2 r1 = new MyThread2("*");
		MyThread2 r2 = new MyThread2("-");
		
		//Runnable을 쓸때는 반드시 thread를 별도로 생성하기!!!!(중요)
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		System.out.print("!!!!");
	}
}
