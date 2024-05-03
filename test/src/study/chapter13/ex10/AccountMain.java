package study.chapter13.ex10;

public class AccountMain {

	public static void main(String[] args) {
		Runnable ra = new SyncExam();
		Thread th1 = new Thread(ra, "thread-1");
		Thread th2 = new Thread(ra, "thread-2");
		
		th1.start();
		th2.start();
	 
		// 코드상으로는 문제가 없는데 실행하면 -가 나온다 
	}

}
