package ch16;

//메소드 앞에 synchronized 를 붙이면 해당 메소드는 객체의 사용권(Monitoring Lock)을 얻는다.
//해당 메소드가 완전히 끝난 이후 다른 메소드가 실행 될 수 있다.

public class MusicBox {
	public void playMusicA( ) {//void 앞에 synchronized를 붙여준다.
		for (int i =0; i<10; i++) {
			synchronized(this) {//synchronized를 특정영역에 지정할 수 도 있다
				//this: MusicBox객체 자신을 가리킴
				//이런 방법도 있지만 100프로 잘 안될 때도 있으니 정석방법 사용이 좋음
			System.out.println("신나는 음악!!");
			}
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicA()
	public synchronized void PlayMusicB() {
		for (int i =0; i<10; i++) {
			System.out.println("슬픈 음악!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for			
	}//playMusicB()
	public synchronized void PlayMusicC() {
		for (int i =0; i<10; i++) {
			System.out.println("카페 음악!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for			
	}//playMusicC()
}
