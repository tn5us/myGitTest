package ch09;

public class Employee2 {
	public int num;//사원번호
	public String name;//이름
	public String address;//주소
	public String email;
	public int salary;//연봉
	private String rrn; //주민번호
	
	
	public String getRrn() {
		return rrn;
	}
	
	public Employee2() {//기본생성자
	}

	public Employee2(int num, String name, String address, String email, int salary, String rrn) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;		
		this.rrn = rrn;
	}
	
}
