package study.chapter6.Object;

public class Tv {	
	String brand;
	int inch;
	int channel;
	int vol;
	boolean power;
	
	public Tv() { // 기본 생성자 
		this.inch = 100;
	}
	
	public Tv(int channel) {
		this(); // 기본생성자 호출 
		
		if(channel >= 1 && channel <= 200) { // 1~200번 채널만 허용하겠다. 
			this.channel = channel;
		} else {
			this.channel = 1;
		}
	}
	
	public Tv(int channel, int vol) {
		this(channel); //위에서 선언한 매개변수 1개짜리 생성자 호출 
		
//		if(channel >= 1 && channel <= 200) { 
//			this.channel = channel;
//		} else {
//			this.channel = 1;
//		}
		
		// 이렇게 위의 생성자와 중복되는 내용은 this()로 처리가능하다. 
	
		if(vol >= 1 && vol <= 50) { 
			this.vol = vol;
		} else {
			this.vol = 0;
		}
	}
	
	public Tv(int channel, int vol, int brd) {
		this(channel, vol);
		
		if(brd == 1) {
			this.brand = "SAMSUNG";
		} else if (brd == 2){
			this.brand = "LG";
		} else if (brd == 3){
			this.brand = "SONY";
		} else  {
			this.brand = "SAMSUNG";
		}
	}
}
