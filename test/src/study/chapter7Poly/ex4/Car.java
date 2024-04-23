package study.chapter7Poly.ex4;

public class Car {
	Tire frontLeftTire = new Tire();
	Tire frontRightTire = new Tire();
	
	Tire rearLeftTire = new Tire();
	Tire rearRightTire = new Tire();
	
	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		rearRightTire.roll();
		rearRightTire.roll();
	}
}
