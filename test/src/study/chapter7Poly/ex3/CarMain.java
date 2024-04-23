package study.chapter7Poly.ex3;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.tire = new Tire();
		car.run();
		System.out.println();
		
		car.tire = new HankookTire();
		car.run();
		System.out.println();
		
		car.tire = new KumhoTire();
		car.run();
		System.out.println();

	}

}
