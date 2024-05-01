package study.chapter11.ex05;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		// num의 .89부분이 반올림 
		
		df = new DecimalFormat("000000000.0000"); // 남은자리 0으로 채워짐 
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#########.####"); // 남은자리 0으로 채워지지 않음
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.#####"); // 3자리마다 ,를 사용해 구분
		System.out.println(df.format(num));

	}

}
