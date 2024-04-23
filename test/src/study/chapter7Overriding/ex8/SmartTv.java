package study.chapter7Overriding.ex8;

public class SmartTv extends Tv{
	boolean caption; // 자막 on off
	
	void captionOnOff() {
		caption = !caption;
		if(caption) {
			System.out.println("자막 기능 활성화");
		} else {
			System.out.println("자막 기능 종료");
		}
	}
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
	@Override
	void volUp() {
		vol++;
	}

	@Override
	void volDown() {
		vol--;
	}
	
}
