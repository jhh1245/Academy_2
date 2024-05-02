package study.chapter13.ex05;

public class ThreadA  extends Thread{
	@Override 
	public void run(){
		for(int i = 0; i < 10; i++) {
			System.out.println("A");
			for(int k = 0; k < 1000000000; k++) {
				
			}
		}
	}
	
}
