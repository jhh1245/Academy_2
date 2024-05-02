package study.chapter13.ex08;

public class SuspendExam extends Thread {
	@Override
	public void run() {
		
		while(true) {
			System.out.println(getName());			// 현재 실행중인 스레드명 출력 
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { 		// 쓰레드명을 1초에 한번씩 출력 
				e.printStackTrace();
			}
		}
	}
}
