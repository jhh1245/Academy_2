package study.chapter06.methodExam;

import study.chapter06.methodExam.Test;

public class TestMain {

	public static void main(String[] args) {
		Test t = new Test();
		
		int num = t.plus(10,20);
		System.out.println("x + y = " + num);
		
		double avg = t.avg(10,5);
		System.out.println("x / y = " + avg);

	}

}
