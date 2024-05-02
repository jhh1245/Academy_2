package study.chapter06.getsetExam;

public class Tv {
	
	// 싱글톤 
	private static Tv tv = new Tv(); // 객체 생성. 동일한 클래스에는 접근 가능 
	
	private Tv(){ //생성자 private로 외부 접근 차단   
	}
	
	static Tv getInstance() { // 리턴타입은 이 클래스 참조타입
		return tv; // 객체를 리턴 
	}
	
	private int channel = 98;
	private int volume = 10;
	private int lastVolume;
	private boolean mute;
	private boolean power;
	
	

	public int getChannel() {
		return channel;
	}

	public void channelUp() {
		if (this.channel == 100) {
			this.channel = 1;
		} else {
			this.channel++;
		}
		System.out.println("현재 채널은 " + this.channel + "번 입니다.");
		
		/* if(channel > 0 && channel < 100){
		 * 		channel++;
		 * } else{ 
		 * 		channel = 1;
		 * }
		 * 
		 */
	}
	
	public void channelDown() {
		if(this.channel == 1) { 
			this.channel = 100;
		} else {
			this.channel--;
		} 
		System.out.println("현재 채널은 " + this.channel + "번 입니다.");
	}
	
	
	public void setChannel(int num) {
		if(num >= 1 && num <= 100) {
			this.channel = num;
		} else {
			System.out.println("입력하신 " + num + "번은 없는 채널입니다.");
		}
		System.out.println("현재 채널은 " + this.channel + "번 입니다."); //this 확인 필수!! 매개변수와 구분해야된다. 
	}


	// 볼륨 
	public void volumeUp() {
		if (this.volume == 50) {
			this.volume = 1;
		} else {
			this.volume++;
		}
	}
	
	public void volumeDown() {
		if(this.volume == 0) { 
			this.volume = 0; 
		} else {
			this.volume--;
		}
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(this.volume == 0) { 
			this.volume = 0; 
		} else if (this.volume == 50) {
			this.volume = 1;			
		} else {
			this.volume = volume;
		}
	}
	
	// 음소거 : 볼륨이 0으로 해제하면 원래 볼륨으로
	
	public boolean isMute() {
		return mute;
	}
	
	void muteOnOff() {
		mute = !mute; //false <-> true 계속 반대로 
		if(mute) {
			System.out.println("음소거 되었습니다.");
			this.lastVolume = this.volume;
			this.volume = 0;
		} else {
			System.out.println("음소거 해제 되었습니다.");
			this.volume = lastVolume;
		}
	}

	
	// 전원 
	
	void powerOnOff() {
		power = !power; //false <-> true 계속 반대로 
		if(power) {
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	// show는 전원 여부, 음소거 여부, 현재 볼륨, 채널정보
	public void show() {
		System.out.println("======================");
		System.out.println("전원 : " + this.power);
		System.out.println("음소거 : " + this.mute);
		System.out.println("볼륨 : " + this.volume);
		System.out.println("채널 : " + this.channel);
		System.out.println();
	}
	
 
	
}
