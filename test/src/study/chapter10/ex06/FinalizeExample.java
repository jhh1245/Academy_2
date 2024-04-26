package study.chapter10.ex06;

public class FinalizeExample {
public static void main(String[] args) {
	
	Counter counter = null;
	
	for(int i = 0; i < 3500; i++) {
		counter = new Counter(i);
		counter = null; // 안쓰게 하려고 
		System.gc(); 
		// 강제로 가비지컬렉터 호출. GC는 소멸자 실행 -> Counter에서 만든 finalize()실행 
	}
}
}
