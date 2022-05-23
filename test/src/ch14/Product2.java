package ch14;

import java.util.Scanner;

public class Product2 {
	private String num;
	private String name;
	private String company;
	private String date;
	private int price;
	private int amount;
	private int money;
	
	public void input() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("제품번호: ");
		num = scan.next();
		System.out.println("제품명: ");
		name = scan.next();
		System.out.println("제조사: ");
		company = scan.next();
		System.out.println("제조일자: ");
		date = scan.next();
		System.out.println("단가: ");
		price = scan.nextInt();
		System.out.println("수량: ");
		amount = scan.nextInt();							
		}
	

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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
		money = (price*amount)+(price/10);
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
