package study.chapter13.ex01;

public class MainThreadExam {

	public static void main(String[] args) {
		
		// 싱글스레드 방식이기 때문에 이 반복문이 끝나야 아래 반복문 실행
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("*");  
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("#");
//		}
		ThreadA th1 = new ThreadA();
		ThreadB th2 = new ThreadB();
		
		System.out.println("시작");
		th1.start();
		th2.start();
		System.out.println("종료");
		
		
		
	}

}
