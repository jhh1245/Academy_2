package study.chapter6.methodExam;

import study.chapter6.methodExam.Tv;

public class TvMain2 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		
		tv1.aaa();
		
		int num = tv1.bbb();
		System.out.println("반환된 데이터 : " + num);
		
		String str = tv1.ccc();
		System.out.println("반환된 데이터 : " + str);
		
		System.out.println(tv1.channel);
		tv1.channelUp();
		System.out.println(tv1.channel);
		tv1.channelDown();
		System.out.println(tv1.channel);
		tv1.powerOnOff();
		tv1.powerOnOff();
	}

}
