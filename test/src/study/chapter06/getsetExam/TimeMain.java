package study.chapter06.getsetExam;

public class TimeMain {

	public static void main(String[] args) {
		Time time = new Time();
		 
		// time.hour = 4;	 // 시간이기 때문에 1~23까지만 들어가야한다. 
		// time.minute = 30; // 분이기 때문에 0~59까지만 들어가야한다.  
		// time.second = 50; // 초이기 때문에 0~59까지만 들어가야한다.
		
		// 그래서 이렇게 직접 넣게 하면 안된다.
		
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		
		
		System.out.println(hour + ":" + minute + ":" + second);
		time.setHour(13);
		time.setMinute(49);
		time.setSecond(50);
		
		System.out.println( time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
		
		time.nowTime();
		
		
		Time time2 = new Time();
		time2.setHour(30); // 범위를 벗어났을 때
		time2.setMinute(70);
		time2.setSecond(90);
		time2.nowTime();

	}

}
