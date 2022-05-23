package ch16;

public class BankPlayer extends Thread{
	int t;
	MyBank myBank;
	
	public BankPlayer(int t, MyBank myBank) {
		this.t =t;
		this.myBank = myBank;
		
	}
	
	public BankPlayer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		switch(t) {
		case 1: myBank.MoneyA(); break;
		case 2: myBank.MoneyB(); break;
		case 3: myBank.MoneyC(); break;
		}
	}
}
