package study.chapter13.ex06;

public class Main {

	public static void main(String[] args) {

		System.out.println("main 쓰레드 시작");
		SleepA thA = new SleepA();
		SleepB thB = new SleepB();
		
		thA.start();
		thB.start();
		
		System.out.println("main 쓰레드 종료");
	}
	  
	public static void delay(long milis) {
		try {
			//thA.sleep(2000); // 호출한 대상은 Main이다. thA가 sleep하는 것이 아니다.  
			Thread.sleep(2000); // 그래서 이렇게 Thread 클래스명으로 메소드를 호출해야 헷갈리지 않는다.  
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

