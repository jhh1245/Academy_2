package study.chapter13.ex03;

public class ThreadA extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.print("+");  
		}
	}
}
