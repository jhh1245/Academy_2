package study.chapter10.ex06;

public class Counter {
	// 필드 
	public int no;
	
	// 생성자
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체가 finalize() 메서드 호출");
		//super.finalize(); // 추후에 없어질 수도 있다 
	}
}
