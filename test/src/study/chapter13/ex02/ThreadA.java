package study.chapter13.ex02;

public class ThreadA implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print("=");  
		}
	}
}
