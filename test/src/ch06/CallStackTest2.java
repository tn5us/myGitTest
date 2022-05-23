package ch06;

public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMeothod();
		System.out.println("main(String[] args)이 끝났음.");		
	}
	public static void firstMeothod() {
		System.out.println("firshMethod()이 시작되었음.");
		secondMethod();
		System.out.println("firshMethod()이 끝났음.");				
	}
	public static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음.");
		System.out.println("secondMethod()이 끝났음.");
	}
}
