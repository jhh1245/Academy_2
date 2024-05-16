package study._06_Example.util;

import java.util.Calendar;

public class MyCalendar {
	// 각 달의 마지막날
	int [] month_array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	int year; 
	int month; 
	int [][] cal_array;
	
	public void setDate(int year, int month) {
		this.year = year; // this 안하면 안됨 
		this.month = month;
		
		makeCalendar(); // 달력 생성 
	}
	
	public boolean isYoon() { // 윤년. 2월달이 29일 되는 달 
		// 1. 최우선 윤년 조건 (400년마다) : 400의 배수 
		if(year % 400 == 0) { 
			return true;
		}
		// 2. 4의 배수이면서 100의 배수가 아닌 해 
		if(year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		return false;
		
	}
	public void makeCalendar() {
		cal_array = new int[6][7];
		int yoil;
		int week = 0;
		
		// 윤년 여부 체크 
		if(isYoon()) {
			month_array[1] = 29; // 2월의 마지막 날은 29
		} else {
			month_array[1] = 28; // main에서 while로 계속 돌릴경우 윤년으로 세팅되어있으면 다시 28일로 바꿔주기 위해서 
		}
		
		int last_day = month_array[month-1]; // 배열은 0부터 시작하기 때문에 
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1); // 날짜 수정 현재날짜기준이 아니고 입력받은 년,월 기준으로 세팅. 캘린더는 1월을 0으로 인식하기 때문에 month-1 
		
		// Calendar에 요일 => 1:일요일, 2:월요일 .. 7: 토요일 
		yoil = c.get(Calendar.DAY_OF_WEEK) - 1; // 몇일인지?
		

		
		// 달력 채우기 (이전 달) 		
		int prev_last_day = 0; // 이전달 마지막 일자 
		
		if(month == 1) { // 현재가 1월인 경우 
			prev_last_day = month_array[11];
		} else { 		// 아닐경우
			prev_last_day = month_array[month-2];
		}
		
		if (yoil > 0) { // 이전달이 보일때만 (1일이 월요일~토요일 일 때)
			//이전달 마지막 요일 = // 이번달의 시작요일 -1부터(yoil-1 부터) ~ yoil이 0이 될 때 까지)
			int prev_yoil = yoil - 1;
			for(int i = prev_yoil; i >= 0; i--) {
				cal_array[week][i] = prev_last_day--;
			}
		}
		
		
		// 달력 채우기 (현재 달) 
		for(int day = 1; day <= last_day; day++) {
			cal_array[week][yoil] = day;
			yoil++;
			if(yoil > 6) { // 토요일이 되면 
				week++;    // 다음줄
				yoil = 0;  // 맨 앞으로. 요일을 일요일로 변경
			}
		}	
		
		
		
		// 달력 채우기 (다음 달)
		for(int day = 1; day <= month_array[month-1]; day++) {
			if(week > 5) { // 주차가 6주를 넘어가면 
				break;
			}
			cal_array[week][yoil] = day;
			yoil++;
			if(yoil > 6) { // 토요일이 되면 
				week++;	   // 다음줄 
				yoil = 0;  // 맨 앞으로. 요일을 일요일로 변경 
			}
		}
		// 시작요일 = 시작날짜, month_array[] = 끝 날짜
	}
	
	public void display() {
		String [] week_day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		System.out.printf("%d년 %d월\n", year, month);
		System.out.println("=============================");
		for(int i = 0 ; i < week_day.length; i++) {
			System.out.printf("%4s", week_day[i]);
		}
		
		System.out.println("\n=============================");
		for(int i = 0; i < 6; i++) { // 주차 row 
			for(int j = 0; j < 7; j++) { // 요일 (col)
				System.out.printf("%4d", cal_array[i][j]);
			}
			System.out.println();
		}
	
	} // end:display()
}
