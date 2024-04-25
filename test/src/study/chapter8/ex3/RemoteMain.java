package study.chapter8.ex3;

import study.chapter8.ex1.RemoteController;

public class RemoteMain {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		
		RemoteControl rc = stv;
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(30);
		rc.getVolume();
		rc.setMute(true); // 인터페이스의 디폴트 메소드도 사용 가능하다   
		
		SearchInterface si = stv;
		si.search("봄옷"); // SearchInterface가 가지고 있는 search() 만 사용 가능 
		
		
		// 익명구현객체 예제 
		
//		RemoteControl rc = new RemoteControl() { // { } 안이 구현 클래스, new를 통해서 객체를 생성한다!! 
//			int volume; //이 코드 밖에서는 사용 불가 
//			
//			@Override
//			public void turnOn() {
//				System.out.println("TV 전원 켭니다.");
//			}
//			
//			@Override
//			public void turnOff() {
//				System.out.println("TV 전원 끕니다.");
//			}
//
//			@Override
//			public void setVolume(int volume) {
//				if(volume > RemoteController.MAX_VOLUME) { // 인터페이스의 최대볼륨 보다 크면 안됨 
//					this.volume = RemoteController.MAX_VOLUME;
//				} else if(volume < RemoteController.MIN_VOLUME) {
//					this.volume = RemoteController.MIN_VOLUME;
//				} else {
//					this.volume = volume;
//					// 여기에 this를 안쓰면? 매개변수 volume에 volume 즉 자기자신에게 할당한거라 의미 없음 그래서 0 
//				}
//			}
//
//			@Override
//			public void getVolume() {
//				System.out.println("현재 TV 볼륨 : " + this.volume);
//			}
//			
//		};
//		
//		rc.turnOn();
//		rc.turnOff();
//		rc.setVolume(40);
//		rc.getVolume();
//		
//		rc.setVolume(60);
//		rc.getVolume();
//		
//		rc.setVolume(-60);
//		rc.getVolume();

		//rc.volume; // 안됨 
	}

}
