package study.chapter13.ex10;

public class SyncExam implements Runnable{
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.balance > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100; 
			// 1 ~ 3까지인데 100, 200, 300 중 랜덤 
			
			acc.withDraw(money);
			
			System.out.println(Thread.currentThread().getName() + "의 잔액 : " + acc.getBalance());
		}
		
	}

	

}
