package study.chapter07.ex10;

public class SportsCar extends Car {
	
	@Override
	void speedUp() {
		speed += 10;
	}
	
//	@Override
//	void stop() {
//		
//	}
	
	// stop 메서드가 final이기 때문에 에러 발생한다. 
}
