package study.chapter13.ex09;

public class Main {

	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadA thA = new ThreadA();
		ThreadB thB = new ThreadB();
		
		thA.start();
		thB.start();
		startTime = System.currentTimeMillis();
		
		
//		System.out.println("소요된 시간 " + (System.currentTimeMillis() - startTime));
//		// 스레드 A랑 B가 끝나기 전에 출력이 먼저되니까 소요된 시간 측정 어려움 
//		
		
		try {
			thA.join(); // 스레드 작업이 끝날때 까지 디개한다.
			thB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("소요된 시간 " + (System.currentTimeMillis() - startTime));
	}

}
