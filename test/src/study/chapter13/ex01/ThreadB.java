package study.chapter13.ex01;

public class ThreadB extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print("#");  
		}
	}

	
}
