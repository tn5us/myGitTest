package ch11;

public class Car implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Car speedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Car speedDown");
	}

	@Override
	public void handle() {
		System.out.println("Car handling");
	}
}
