package study.chapter13.ex08;

public class Main {

	public static void main(String[] args) {

		SuspendExam th1 = new SuspendExam();
		SuspendExam th2 = new SuspendExam();
		SuspendExam th3 = new SuspendExam();
		
		th1.setName("Thread-1");
		th2.setName("Thread-2");
		th3.setName("Thread-3");
		System.out.println(th1.getName());
		System.out.println(th2.getName());
		System.out.println(th3.getName()); 
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend(); // 일시 정지 
			Thread.sleep(2000);
			th1.resume(); // 실행대기 
			th3.suspend();
			Thread.sleep(2000);
			th3.resume();
			th1.stop();
			th2.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

