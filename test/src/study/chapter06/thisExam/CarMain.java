package study.chapter06.thisExam;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car("벤츠");
		
		Car yourCar = new Car("BMW");
		
		myCar.run();
		myCar.speed = 100;
		System.out.println(myCar.speed);
		
		yourCar.run();
		yourCar.speed = 200;
		System.out.println(yourCar.speed);
		
		

	}

}
