package study.chapter8.ex3;

public interface RemoteControl {
	
	// 인터페이스가 만들 수 있는 것 : 
	
	// 상수 
	int MAX_VOLUME = 50; 
	int MIN_VOLUME = 0;
	
	// 추상메서드 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void getVolume();
	
	// default 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다. ");
		}
	}
	
	// 정적메서드
	static void changeBattery() {
		System.out.println("배터리를 교체합니다.");
	}
	
}
