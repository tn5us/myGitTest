package ch16;
//멀티 스레드는: 작업단위가 2개 이상
//구현방법1: Thread를 상속
//구현방법2: Runnable을 구현
public class ThreadExam extends Thread{
	public ThreadExam(String name) {
		super(name);
	}
	
	@Override
	public void run() {//run 메소드 오버라이딩 필수
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}// 1초 멈춤
			System.out.println("스레드 run 메소드 실행");
		}
	}
	
	public static void main(String[] args) {
		ThreadExam e1 = new ThreadExam("thread1");
		ThreadExam e2 = new ThreadExam("thread2");
		ThreadExam e3 = new ThreadExam("thread3");
		
		//e1.run(); //run 메소드를 직접쓰면 안됨 start를 반드시 써야한다.(주의)
		e1.start();//스레드 객체 이름.star() =>run()이 자동호출됨
		e2.start();//위와 동시에 호출
		e3.start();//위와 동시에 호출
		
	}
}
