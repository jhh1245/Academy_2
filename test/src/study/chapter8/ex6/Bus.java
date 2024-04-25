package study.chapter8.ex6;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
	}
	
	public void checkPrice() {
		System.out.println("버스요금을 결제합니다.");
	}

}
