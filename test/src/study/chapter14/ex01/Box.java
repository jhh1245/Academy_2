package study.chapter14.ex01;

public class Box {
	// 필드 
	private Object obj; // 어떤 타입이 들어와도 Object타입이 된다.
	

	// 메서드 
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() { // 리턴타입이 Object 
		return obj;
	}
}
