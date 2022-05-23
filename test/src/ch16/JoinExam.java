package ch16;

public class JoinExam {
	public static void main(String[] args) {
		MyThread3 thread = new MyThread3();
		thread.start();
		System.out.println("Tread가 종료될때까지 기다립니다.");
		try {
			thread.join();//main 스레드가 잠시 멈춰서 Thread3가 반복 된후 다시 main스레드로 다시 돌아옴
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread가 종료되었습니다.");
	}
}
