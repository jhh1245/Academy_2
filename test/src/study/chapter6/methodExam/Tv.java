package study.chapter6.methodExam;

public class Tv {
	String brand;
	boolean power;
	int inch; 
	int channel;
	int vol;

	void aaa() {
		System.out.println("리턴이 없는 메서드가 호출되었습니다.");
	}
	
	int bbb() {
		System.out.println("리턴 타입이 int인 메서드가 호출되었습니다.");
		return 100;
	}
	
	String ccc() {
		System.out.println("리턴 타입이 String인 메서드가 호출되었습니다.");
		return "Hello";
	}
	
	void channelUp() {
		channel++;
		System.out.println("채널 1 증가합니다.");
	}
	
	void channelDown() {
		channel--;
		System.out.println("채널 1 감소합니다.");
	}
	
	void powerOnOff() {
		power = !power; //false <-> true 계속 반대로 
		if(power) {
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
		
	}
}
