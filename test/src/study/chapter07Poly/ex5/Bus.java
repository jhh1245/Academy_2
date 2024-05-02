package study.chapter07Poly.ex5;

public class Bus extends Vehicle { // 상속받았다 = 부모의 run을 사용할 수 있다.
	@Override 
	void run() {
		System.out.println("버스가 달립니다.");
	}

}
