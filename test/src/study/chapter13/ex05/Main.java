package study.chapter13.ex05;

public class Main {

	public static void main(String[] args) {
		ThreadA thA = new ThreadA();
		ThreadB thB = new ThreadB();
		
		System.out.println(thA.getName());
		System.out.println(thA.getPriority()); // 우선순위값 5 
		
		System.out.println(thB.getName());
		System.out.println(thB.getPriority()); // 우선순위값 5 
		
		thA.setPriority(7);
		thB.setPriority(5);
		
		System.out.println(thA.getPriority());
		System.out.println(thB.getPriority());
		
		thA.start();
		thB.start();
	}
}

