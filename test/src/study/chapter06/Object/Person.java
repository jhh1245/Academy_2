package study.chapter6.Object;

public class Person {
	public static void main(String[] args) {
		// speed = 20; // 여기서 speed 변수는 사용 불가하다. Car 객체를 만들어야한다.  
		
//		Car myCar = new Car(); // 생성자를 통해서 10으로 초기값 들어감
//		System.out.println(myCar.speed); // 10
//		
//		myCar.speed = 50; // public이니까 직접 변경 가능
//		System.out.println(myCar.speed); // 50
//		
//		myCar.method(); // 100으로변경
//		System.out.println(myCar.speed); // 100
//		
//		
//		
//		Car yourCar = new Car();
//		
//		System.out.println(yourCar.speed); // 10
//		
//		System.out.println("===");
//	
//		System.out.println(yourCar.company);
//		System.out.println(yourCar.model);
//		System.out.println(yourCar.maxSpeed);
//		System.out.println(yourCar.productionYear);
//		System.out.println(yourCar.currentSpeed);
//		System.out.println(yourCar.engineStart);
//		
//		System.out.println(myCar); // 주소 값이 다르다. 다른 객체이다. 
//		System.out.println(yourCar);
		
//		Car myCar = new Car();
//		System.out.println(myCar.model); 
//		System.out.println(myCar.color);
//		System.out.println(myCar.maxSpeed);
//		
//		Car yourCar = new Car("그랜저2","스카이블루",500);
//		System.out.println(yourCar.model);
//		System.out.println(yourCar.color);
//		System.out.println(yourCar.maxSpeed);
		
		
		Car myCar = new Car();
		System.out.println(myCar.model); 
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		
		Car yourCar = new Car("그랜저2","스카이블루",500);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		
	}
}
