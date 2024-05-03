package study.chapter13.ex10;

public class Account {
	int balance = 1000;			// 계좌 잔액 
	
	public int getBalance() {	// 계좌 잔액 확인하는 메서드 
		return balance;
	}
	
	public synchronized void withDraw(int money) {	// 계좌에서 인출하는 메서드 
		if(balance >= money) {			// 인출할 금액보다 계좌 잔고가 큰 경우 인출
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= money;			// 인출시 잔고에서 누적 차감 
		}
		
	}
}
