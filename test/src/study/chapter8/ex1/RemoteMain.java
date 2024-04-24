package study.chapter8.ex1;

public class RemoteMain {

	public static void main(String[] args) {
		// RemoteController rc = new RemoteController(); // new로 객체 생성 X
		RemoteController rc; 
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(100);
		rc.getVolume();
		// System.out.println(rc.volume); // 못함 
		System.out.println();
		 
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(-5);
		rc.getVolume();
		System.out.println();
		
		
		rc.setMute(false); // 디폴트 메서드
		RemoteController.changeBattery(); // 정적 메서드 
		

	}

}
