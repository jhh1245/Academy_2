package study.chapter11.ex04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date day = new Date();
		String nowTime = day.toString();
		System.out.println(nowTime);
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String sdfTime = sdf.format(day);
		System.out.println(sdfTime);

	}

}
