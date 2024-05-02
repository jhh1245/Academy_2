package study.chapter13.ex02;

public class Main {

	public static void main(String[] args) {
		Runnable th1 = new ThreadA();
		Thread thread1 = new Thread(th1);
		
		Runnable th2 = new ThreadB();
		Thread thread2 = new Thread(th2);
		
		thread1.setName("Thread A");
		thread2.setName("Thread B");
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		
		System.out.println("시작");
		thread1.start();
		thread2.start();
		System.out.println("종료");
	}

}
