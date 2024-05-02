package study.chapter06.staticExam;

public class Car {

	// 인스턴스 필드, 메서드 
	int speed; 
	void run() {
		System.out.println("현재 속도는 " + speed + "km 입니다.");
	}
	
	public static void main(String[] args) { // 이곳은 정적 초기화 블록이다.  static이 붙었으니까  
		// speed = 10; 
		//안되는 이유는 이 곳은 static 메서드이기 때문에 객체를 만들어야 한다. (예제 StaticEx01 참고)  
		// 아니면, 인스턴스 멤버를 정적멤버로 변경 하거나
		
		Car car = new Car();
		car.speed = 100;
		car.run();

	}

}
