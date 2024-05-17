package study._06_Example.mymain;

import java.util.Scanner;

import study._06_Example.util.MyCalendar;

public class _10_Exam_이차원배열_달력 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MyCalendar mc = new MyCalendar();
		int year;
		int month;
		String yn = "y";
		
		while(true) {
			System.out.print("연도/월 : ");
			year = scanner.nextInt();
			month = scanner.nextInt();
			
			System.out.printf("%d-%02d\n", year, month);
			
			
			
			mc.setDate(year,month);
			mc.display();
			
			System.out.print("계속 (y/n) : ");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break; 
		} // end : while
		System.out.println("--[End]--");

	}

}
