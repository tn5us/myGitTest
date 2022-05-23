package ch08;

public class Member {
	private String name;
	private String userid;
	private int money;
	private String grade; //10만원 이상 구매: gold, 5만원이상 silver, 그외 bronze
	
	public Member() {
		
	}

	public Member(String name, String userid, int money) {		
		this.name = name;
		this.userid = userid;
		this.money = money;
		if (money >=100000) {
			grade ="gold";
		}else if (money >=50000) {
			grade = "silver";
		}else {
			grade = "bronze";
		}		
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+grade);
	}
	
	
}
