package study.chapter8.ex1;

public class Audio implements RemoteController{
	// 필드 
	int volume;
		
	@Override
	public void turnOn() {
		System.out.println("오디오 전원 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("오디오 전원 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteController.MAX_VOLUME) { // 인터페이스의 최대볼륨 보다 크면 안됨 
			volume = RemoteController.MAX_VOLUME;
		} else if(volume < RemoteController.MIN_VOLUME) {
			volume = RemoteController.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}

	

	@Override
	public void getVolume() {
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	} 
}
