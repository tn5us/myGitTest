package ch11;

public class Computer implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 켠다");	
	}
	@Override
	public void tutnOff() {
		System.out.println("컴퓨터를 끈다");
	}
}
