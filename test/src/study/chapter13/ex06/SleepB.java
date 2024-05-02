package study.chapter13.ex06;

public class SleepB extends Thread{
	@Override 
	public void run(){
		for(int i = 0; i < 500; i++) {
			System.out.print("-");
		}
		System.out.println("SleepB 쓰레드 종료");
	}
}
