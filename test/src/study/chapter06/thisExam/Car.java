package study.chapter06.thisExam;

public class Car {
	
	// 필드
	String model;
	int speed;
	
	// 생성자 
	Car(String model){
		// model = model; // 매개변수로 받은 값을 다시 자신에게 할당. 이 방법은 X   
		this.model= model; // 이렇게 해야 인스턴스 변수에 값 할당 
	}
	
	// 메서드 
	void setSpeed(int speed) {
		this.speed = speed; 
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			this.setSpeed(i); // 인스턴스 메서드 호출 !!
			System.out.println(this.model + "이 달립니다. 속도는 시속 " + this.speed + "km입니다.");
		}
	}
	
}
