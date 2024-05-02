package study.chapter13.ex04;

public class InputExam extends Thread {
	@Override
	public void run() {
		System.out.println("카운트 다운을 시작합니다.");
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace(); // 스레드를 일정시간 재우는 기능(1000분의 1초) 
			} 
		}
		System.out.println("카운트 다운이 종료되었습니다.");
	}

}
