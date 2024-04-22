package study.chapter6.getsetExam;


public class TvMain {

	public static void main(String[] args) {

		Tv tv = Tv.getInstance();
		
		tv.powerOnOff();
		tv.show();

		tv.channelUp();
		tv.show();
		
		tv.channelDown();
		tv.show();
			
		tv.setChannel(100);
		tv.show();
		
		tv.setChannel(101);
		tv.show();
		
		tv.setChannel(-1);
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
