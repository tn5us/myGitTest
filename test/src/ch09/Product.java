package ch09;
//DTO(Data Transfer Object
public class Product {
	private int code; //제품코드
	private String name;
	private String company;//제조회사
	private String date;//제조날짜
	
	//getter, setter
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}