package study.chapter11.ex04;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
//		int year = cal.get(Calendar.YEAR);			// 년도 리턴 
//		int month = cal.get(Calendar.MONDAY)+1;		// 월 리턴
//		int day = cal.get(Calendar.DAY_OF_MONTH);	// 일 리턴 
//		
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(day);
//		
//		int week = cal.get(Calendar.DAY_OF_WEEK); //
//		String dayOfWeek = "";
//		switch(week) {
//		case 1:
//			System.out.println("일요일");
//			break;
//		case 2:
//			System.out.println("월요일");
//			break;
//		case 3:
//			System.out.println("화요일");
//			break;
//		case 4:
//			System.out.println("수요일");
//			break;
//		case 5:
//			System.out.println("목요일");
//			break;
//		case 6:
//			System.out.println("금요일");
//			break;
//		case 7:
//			System.out.println("토요일");
//			break;	
//			
//		}
		
		int hour1 = cal.get(Calendar.HOUR);
		int hour2 = cal.get(Calendar.HOUR_OF_DAY);
		
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(hour1 + "시 " + minute + "분 " + second + "초");
		
		int ampm = cal.get(Calendar.AM_PM); //am : 0, pm : 1

		if(ampm == Calendar.AM) {  // Calendar.AM 값은무조건 0, 즉 오전이면 이라는 뜻임 
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}

	}

}
