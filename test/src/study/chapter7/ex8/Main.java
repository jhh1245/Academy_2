package study.chapter7.ex8;

public class Main {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		
		stv.channel = 10;
		stv.channelUp();
		System.out.println("현재 채널 : " + stv.channel);

		stv.displayCaption("아이엠 아이언맨");
		stv.captionOnOff();
		stv.displayCaption("아이엠 앤트맨");
		
		stv.volUp(); // 오버라이딩 
		stv.volUp();
		stv.volUp();
		System.out.println(stv.vol);
		stv.volDown();
		System.out.println(stv.vol);
		
	}

}
