package study.chapter6.getsetExam;

public class Time {
	private int hour;
	private int minute;
	private int second;	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour >= 1 && hour <= 23) {
			this.hour = hour;
		} 
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute >= 0 && minute <= 59) {
			this.minute = minute;
		} 
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second >= 0 && second <= 59) {
			this.second = second;
		}
	}
	
	public void nowTime() {
		System.out.println("현재 시간은 " + hour + ":" + minute + ":" + second);
	}
}