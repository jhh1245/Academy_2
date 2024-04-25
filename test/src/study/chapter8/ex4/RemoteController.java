package study.chapter8.ex4;

public interface RemoteController {
	// 상수 (public static final이 컴파일 과정에서 자동으로 추가) 상수는 무조건 값이 있어야 한다. 
	// int a; // 에러 
	
	// 상수 
	int MAX_VOLUME = 50;
	int MIN_VOLUME = 0;
	int volume = 110;
  
	
	// 추상 메서드 (public abstract가 컴파일 과정에서 자동으로 추가)  
	void turnOn();
	void turnOff();
	void setVolume(int volume); // 리턴타입, 매개변수를 작성 할 수 있다. 
	void getVolume(); // 여기 새롭게 추가하면 텔리비전하고 오디오에서 오버라이딩하라고 에러남 
	
	// default 메서드 (자바8버전에서 추가되었으며, public이 컴파일과정에서 자동으로 추가) 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음으로 처리합니다.");
		} else {
			System.out.println("무음을 해제합니다.");
		}
	}
	
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
