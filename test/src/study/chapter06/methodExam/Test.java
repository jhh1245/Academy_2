package study.chapter06.methodExam;

public class Test {
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) { // 리턴타입이 double이라고 매개변수까지 double일 필요 없다. 
		double sum = plus(x, y);
		double num = sum / 2;
		return num;
	}
}
