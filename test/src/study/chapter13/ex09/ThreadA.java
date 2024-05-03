package study.chapter13.ex09;

public class ThreadA  extends Thread{
	@Override 
	public void run(){
		for(int i = 0; i < 300; i++) {
			System.out.println("A");
			for(long l = 0; l < 2000000000L; l++) { // 시간 지연을 위한 반복문 
				
			}
		}
	}
}