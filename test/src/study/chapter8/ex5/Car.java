package study.chapter8.ex5;

public class Car {
//	Tire frontLeftTire = new HankookTire();
//	Tire frontRightTire  = new HankookTire();
//	
//	Tire rearLeftTire = new KumhoTire();
//	Tire rearRightTire = new KumhoTire();
	
	Tire[] tires = { // 배열은 타입이 동일 해야 한다. 
		new HankookTire(),
		new HankookTire(),
		new KumhoTire(),
		new KumhoTire()
	};
	
	
	void run() {
		for(Tire tire : tires) { 
			// 향상된 for문은 일부만 사용 할 수 없다. 여기서는 4개 모두 사용할 거니까 써도된다 
			tire.roll();
		}
		
//		for(int i = 0; i < 4; i++) { // front, rear로 시작하는 변수가 이제는 사용 할 수 없다.
//			tires[i].roll();
//		}
	}
}
