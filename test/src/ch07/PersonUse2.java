package ch07;

public class PersonUse2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.email= "hong@naver.com";
		p1.address= "서울 강남구 역삼동";
		System.out.println("이름 :"+p1.getName());
		System.out.println("나이 :"+p1.getAge());
		System.out.println("이메일: "+p1.email);
		System.out.println("주소: "+ p1.address);
		System.out.println();
		Person p2 = new Person();
		p2.setName("사임당");
		p2.setAge(23);
		p2.email= "saimdang@daum.net";
		p2.address= "서울 강남구 개포동";
		System.out.println("이름 :"+p2.getName());
		System.out.println("나이 :"+p2.getAge());
		System.out.println("이메일: "+p2.email);
		System.out.println("주소: "+ p2.address);
				
	}
}
