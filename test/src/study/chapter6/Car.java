package study.chapter6;

public class Car {
	int speed; // 필드 또는 멤버 변수 
	String company;
	String model;
	String color;
	int maxSpeed;
	int productionYear;
	int currentSpeed;
	boolean engineStart;
	
	public Car() { // 기본생성자 
		speed = 10; // 초기값 지정. 객체 만들면 기본값 지정됨
		color = "검정";
		company = "현대자동차";
		model = "그랜저";
		maxSpeed = 300;
	}
	
	public Car(String model, String color, int maxSpeed) { // 생성자
		model = model; //이렇게 쓰면 매개변수로 받은 변수에 그냥 다시 넣는것이기 때문에 this가 필요하다. 
		color = color;
		maxSpeed = maxSpeed; 
		
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
	}
	
	void method() { // 메서드
		speed = 100;
	}
}
