package ch16;

public class MyThreadUse2 {
	public static void main(String[] args) {	
		MyThreadEx2 e1 = new MyThreadEx2("스레드1**");
		MyThreadEx2 e2 = new MyThreadEx2("스레드2++");
		MyThreadEx2 e3 = new MyThreadEx2("스레드3##");
		
		
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		Thread t3 = new Thread(e3);
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	
	
	}	
}
