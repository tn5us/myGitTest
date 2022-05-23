package ch16;

public class ATMsync {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "mom");
		Thread son = new Thread(atm, "son");
		mom.start();
		son.start();		
	}
}

class ATM implements Runnable {
	private long depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<10; i++) {
				notify();//일시정지상태에 있는 스레드를 깨우는 역할
				//wait하고 있는 스레드(한개만)에 [notify신호]를 보낸다. 여러 스레드에서 wait을 
				//하고 있어도 한 개만 꺠우게 된다. 어떤 스레드를 깨울지는 알 수 없다. wait을 하고있는
				//스레드가 없는 경우 [notify신호]는 그냥 소멸한다.
				
				//notifyAll();: wait 하고있는 모든 스레드를 깨운다. 이때 깨어나는 순서는
				//어떤 것이 먼저 깰지 모른다. 
				try {
					wait();//현재 실행스레드를 일시정지 상태로 만들면서 다른 스레드가 실행되도록 허용
					Thread.sleep(1000);//실행속도를 조정
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (getDepositeMoney()<=0) {//잔액이 0원 이하면
					break;
				}
				withDraw(1000);
			}//end for
		}
	}//end run

	public void withDraw(long howMuch) {
		if (getDepositeMoney()>0) {
			depositeMoney-=howMuch;
			System.out.print(Thread.currentThread().getName()+",");
			System.out.printf("잔액: %,d원 %n", getDepositeMoney());
		}else {
			System.out.print(Thread.currentThread().getName()+",");
			System.out.println("잔액이 부족합니다.");
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
	
}