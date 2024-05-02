package study.chapter07.ex10;

public class Car {
	int speed;
	
	void speedUp() {
		speed++;
	}
	
	final void stop() { // 어떤 종류의 차던간에 똑같이 동작하고 싶을 때 final 붙인다. 
		System.out.println("차를 멈춥니다.");
	}
}
