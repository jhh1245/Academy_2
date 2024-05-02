package study.chapter13.ex05;

public class ThreadB  extends Thread{
	@Override 
	public void run(){
		for(int i = 0; i < 10; i++) {
			System.out.print("B");
			for(int k = 0; k < 1000000000; k++) {
				
			}
		}
	}
}