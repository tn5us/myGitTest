package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.tutnOff();
		tv.remoteOn();
		tv.remoteOff();
		Controllable.reset();//static 메소드인 reset()은 클래스 이름.메소드로 접근가능		
		
		Computer com = new Computer();
		com.turnOn();
		com.tutnOff();
		com.repair();
		Controllable.reset();
	}
}
