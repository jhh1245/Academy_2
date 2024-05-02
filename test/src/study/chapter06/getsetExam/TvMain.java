package study.chapter06.getsetExam;


public class TvMain {

	public static void main(String[] args) {

		Tv tv = Tv.getInstance();
		Tv tv1 = Tv.getInstance();
		Tv tv2 = Tv.getInstance(); // 3개는 같은 객체 그러나 new로 만든다면 다 다른객체가된다. 
				
		tv.powerOnOff(); 	// on 
	
		
		tv.channelUp(); 	// 99 
		tv.channelUp(); 	// 100
		tv.channelUp(); 	// 1
		tv.show();
		
		
		tv.channelDown(); 	// 100
		tv.channelDown(); 	// 99
		tv.show();
		
		tv.setChannel(200); // 99
		tv.setChannel(75);
		tv.setChannel(100);
		tv.setChannel(1);
		tv.setChannel(-1); 	// 1
		tv.show();
		
		
		tv.volumeDown();
		tv.show();
		
		tv.volumeUp();
		tv.volumeUp();
		tv.show();
		
		tv.muteOnOff();
		tv.show();
		
		tv.muteOnOff();
		tv.show();
		
		tv.volumeUp();
		tv.show();
		
		tv.muteOnOff();
		tv.show();
		
		tv.muteOnOff();
		tv.show();
	}
}
