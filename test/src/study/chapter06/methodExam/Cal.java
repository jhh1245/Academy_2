package study.chapter06.methodExam;

public class Cal {
	// 메서드 오버라이딩 //
	
	// 리턴타입이 없고 매개변수도 없는 add() 메서드
	void add() {  
		int result = 10 + 20;
		System.out.println("result : " + result);
		
	}
	
	// 매개변수가 2개이고 리턴타입이 없는 add() 메서드
	void add(int a, int b) {
		int result = a + b;
		System.out.println(a + " + " + b + " = " + result);
	}
	
	// 매개변수가 1개이고 리턴타입이 int인 add() 메서드
	int add(int a) {
		int result = a + a;
		return result;
	}

}
