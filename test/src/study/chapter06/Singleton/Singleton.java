package study.chapter6.Singleton;

public class Singleton {
	private static Singleton sgt = new Singleton(); // 객체 생성. 동일한 클래스에는 접근 가능 
	
	private Singleton(){ // 기본생성자 기본값은 public이지만 private로 외부 접근 차단   
		
	}
	
	static Singleton getInstance() { // 리턴타입은 이 클래스 참조타입
		return sgt; // 객체를 리턴 
		
	}
}
