package ch16;

public class MyThreadEx2 implements Runnable{
	String str;
	public MyThreadEx2(String str) {
		this.str=str;
	}
	public MyThreadEx2() {
		
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			
		}
	}

}
