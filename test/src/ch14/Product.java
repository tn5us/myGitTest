package ch14;

public class Product {
	private String name;
	private String company;
	private String date;
	private int price;
	private int amount;
	private int money;
	
	//getter, setter,생성자
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		money = price*amount;
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String company, String date, int price, int amount) {
		super();
		this.name = name;
		this.company = company;
		this.date = date;
		this.price = price;
		this.amount = amount;
		
	}	
	
}
