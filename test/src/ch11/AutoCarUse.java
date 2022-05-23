package ch11;

public class AutoCarUse {
	public static void main(String[] args) {
		//좌:부, 우:자
		OperateCar a = new AutoCar();//다형성
		a.start();		
		a.setSpeed(90);
		a.turn(15);
		a.stop();
		
	}
}
