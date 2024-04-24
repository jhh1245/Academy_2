package study.chapter8.ex1;

public class Television implements RemoteController{
	// 필드 
	int volume;
	
	
	// 추상메서드의 실체메서드 
	@Override
	public void turnOn() {
		System.out.println("TV 전원 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV 전원 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteController.MAX_VOLUME) { // 인터페이스의 최대볼륨 보다 크면 안됨 
			this.volume = RemoteController.MAX_VOLUME;
		} else if(volume < RemoteController.MIN_VOLUME) {
			this.volume = RemoteController.MIN_VOLUME;
		} else {
			this.volume = volume;
			
			// @@ 여긴 this 안쓰면 왜 인터페이쓰거가져오나? 
		}
	}
	
	@Override
	public void getVolume() {
		System.out.println("현재 TV 볼륨 : " + this.volume);
		// @@ 여기서 this 쓰나 안쓰나 똑같?
	} 
}
