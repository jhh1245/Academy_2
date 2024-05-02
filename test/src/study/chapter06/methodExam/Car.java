package study.chapter6.methodExam;

public class Car {
	int gas;
	
	boolean isLeftGas() {
		if(gas <= 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("현재 가스량 : " + gas);
		return true;
	}
	
	void setGas(int gas) {
		this.gas = gas;
		System.out.println("충전량 : " + this.gas);
	}

	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("차가 달립니다. 가스 잔량 : " + gas);
				gas--;
			} else {
				System.out.println("가스가 없어 차가 멈춥니다.");
				return;
			}
			
		}
	}
}
