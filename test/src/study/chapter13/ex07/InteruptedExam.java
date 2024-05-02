package study.chapter13.ex07;

public class InteruptedExam extends Thread {

	@Override
	public void run() {
//		int i = 10;
//		
//		while(i != 0 && !isInterrupted()) { // false 인데 !을 붙여서 true가 됨 
//			System.out.println(i--);
//			for(long x = 0; x < 100000000L; x++) {
//				
//			}
//			
//		}
//		System.out.println("카운트 다운이 종료되었습니다.");
		
		try {
			//thA.sleep(2000); // 호출한 대상은 Main이다. thA가 sleep하는 것이 아니다.  
			Thread.sleep(10000); // 그래서 이렇게 Thread 클래스명으로 메소드를 호출해야 헷갈리지 않는다.  
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
