package study.chapter15.ex04;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMain_Map {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("출생년도 : ");
		int year = scanner.nextInt();
		
		Calendar now = Calendar.getInstance();
		int current_year = now.get(Calendar.YEAR);
		int current_month = now.get(Calendar.MONTH) + 1; // 0부터 시작 
		System.out.println(current_month);
		
		int current_day = now.get(Calendar.DATE);
		
		System.out.println(current_day);
		int age = current_year - year + 1;

		
		// 나이 :  현재년도 - 출생년도
		
		// 띠
		// 4  5  6  7  8  9  10 11 0  1  2  3  <- year % 12 (0 ~ 11) 
		// 자 축 인 묘 진 사 오 미 신 유 술 해 
		// 쥐 소 범 토 용 뱀 말 양 원 닭 개 돼 
		
		// 1980년 % 12(나머지) = 0 = 신 = 원숭이 띠
		
		Map<Integer, String> ttiMap = new HashMap<Integer, String>();
		
		ttiMap.put(0, "원숭이");
		ttiMap.put(1, "닭");
		ttiMap.put(2, "개");
		ttiMap.put(3, "돼지");
		ttiMap.put(4, "쥐");
		ttiMap.put(5, "소");
		ttiMap.put(6, "호랑이");
		ttiMap.put(7, "토끼");
		ttiMap.put(8, "용");
		ttiMap.put(9, "뱀");
		ttiMap.put(10, "말");
		ttiMap.put(11, "양");
		
		String tti = ttiMap.get(year % 12);
		
		System.out.printf("%d년도생은 %d살, %s 띠입니다.", year, age, tti);
		
		scanner.close();
	}

}
