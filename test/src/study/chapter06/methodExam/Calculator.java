package study.chapter06.methodExam;

public class Calculator {
	void add(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a + b));
	}
	
	int plus(int a, int b) {
		int result = a + b;
		return result; // 리턴은 호출한 곳으로 값을 주겠다는 의미 
	}
	double divide(int x, int y) {
		double result = x / (double)y;
		return result; 
	}
}
