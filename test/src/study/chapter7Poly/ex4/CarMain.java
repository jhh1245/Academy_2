package study.chapter7Poly.ex4;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		HankookTire han = new HankookTire();
		KumhoTire kum = new KumhoTire();
		
		myCar.run();
		
		System.out.println();

		myCar.frontLeftTire = han; 
		//myCar의 frountLeftTire 필드가 han으로 변경되었다. = 한국타이어의 roll()을 호출한다. 
		myCar.frontRightTire = han;
		myCar.rearLeftTire = kum;
		myCar.rearRightTire = kum;
		myCar.run();
		

	}

}
