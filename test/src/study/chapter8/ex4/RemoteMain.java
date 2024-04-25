package study.chapter8.ex4;

public class RemoteMain {

	public static void main(String[] args) {
		
		
		RemoteController rc; 
		rc = new Television();
		
		rc.setMute(true); // 인터페이스의 디폴트 메소드를 오버라이딩해서 사용 가능하다  
		
		rc = new Audio();
		rc.setMute(true); 
		// 디폴트 메소드를 오버라이딩 하지 않아서 인터페이스 메소드를 가져옴 
		
		RemoteController.changeBattery(); // 정적 메소드는 클래스 명으로 사용 가능 
		
	}

}
