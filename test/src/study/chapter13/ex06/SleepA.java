package study.chapter13.ex06;

public class SleepA extends Thread{
	@Override 
	public void run(){
		Main.delay(2000);
		for(int i = 0; i < 500; i++) {
			System.out.print("-");
		}
		System.out.println("SleepA 쓰레드 종료");
	}
}