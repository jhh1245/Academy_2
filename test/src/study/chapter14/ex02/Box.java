package study.chapter14.ex02;

public class Box <T>{ 
	// 객체를 만들때 String으로 만들면 컴파일할 때 T가 String으로 바뀜
	private T t;
	
	public void setGeneric(T t) { // T가 어떤 타입인지는 아직 모른다. 객체를 만들때! 결정된다.  
		this.t = t;
	}
	
	public T getGeneric() {
		return t;
	}
}
