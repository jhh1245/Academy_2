package study.chapter8.ex5;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run();
		
		System.out.println();
		
		
		// 앞바퀴 두개, 뒷바퀴 두개 타이어 교체  = 필드 다형성 
//		car.frontLeftTire = new KumhoTire();
//		car.frontRightTire  = new KumhoTire();
//		
//		car.rearLeftTire = new HankookTire();
//		car.rearRightTire = new HankookTire();;

		//배열 인덱스를 활용해 타이어 교체 
		car.tires[0] = new KumhoTire();
		car.tires[1] = new KumhoTire();
		car.tires[2] = new HankookTire();
		car.tires[3] = new HankookTire();
		car.run();
	}

}
