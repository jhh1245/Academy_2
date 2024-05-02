package study.chapter7.ex2;

public class SmartPhone extends Cellphone {
	int channel; 
	String search; 
	
	
	SmartPhone(String model, String color){ 
		//super(); -> 자동으로 만들어줌 
		this.model = model; // model, color 는 부모에서 상속 
		this.color = color;
 	}
	
	SmartPhone(String model, String color, int channel){ 
		this.model = model; // model, color 는 부모에서 상속 
		this.color = color;
		this.channel = channel;
 	}
	
	SmartPhone(String model, String color, int channel, String search){ 
		this.model = model; // model, color 는 부모에서 상속 
		this.color = color; 
		this.channel = channel;
		this.search = search;
 	}
	
	// 메서드 (DMB, 검색) 
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번의 방송 수신을 시작합니다.");
		// 여기서 channel은 객체 자신의 채널을 의미 
	}
	
	void changeDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + this.channel + "번으로 변경합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
	
	void search(String search) {
		this.search = search;
		System.out.println("입력하신 " + search + "를 검색합니다.");
	}
}
