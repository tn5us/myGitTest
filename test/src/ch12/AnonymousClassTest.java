package ch12;

interface RemoteControl{
	//추상메소드 (구현부가 없는 메소드)
	void turnOn();
	void turnOff();
}


public class AnonymousClassTest {
	public static void main(String[] args) {
		//interface는 new해서 객체생성을 못한다.
		//무명클래스 처리하면 자동적으로 인터페이스를 무명클래스가 상속받아 오버라이딩 처리할 수 있다.
		RemoteControl ac  = new RemoteControl() {//무명내부클래스
			
			@Override
			public void turnOn() {//구현	
				System.out.println("TV turnOn()");
			}
			
			@Override
			public void turnOff() {//구현
				System.out.println("TV turnOff()");
			}
		};//블럭끝에 세미콜론이 있다?...무명내부클래스
		ac.turnOn();
		ac.turnOff();
		
	}
}
