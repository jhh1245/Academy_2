package study.chapter13.ex03;

public class Main {

	// 메인 메서드 실행시 JVM은 메인 스레드를 사용해 메인 메서드 코드를 수행한다.
	// 스레드는 2종류이다. 사용자 스레드와, 데몬 스레드  
	// 메인스레드가 종료되어도 프로그램은 종료되지 않는다. 
	// 메인스레드와 사용자 스레드가 모두 종료된 뒤 프로그램이 종료된다.
	
	static long startTime = 0;
	public static void main(String[] args) {
		ThreadA thread1 = new ThreadA();
		ThreadB thread2 = new ThreadB();
		
		thread1.start();
		thread2.start();
		
		startTime = System.currentTimeMillis(); // 1/1000 초
		
		try {
			thread1.join(); // 해당 스레드 작업이 종료될때까지 대기
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));
	}

}

