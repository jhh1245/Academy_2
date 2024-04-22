package study.chapter6.thisExam;

public class Calculator {
	// 인스턴스 필드 -> 객체가 필요하다. 
	int speed;
	String color; 
	
	// 정적 필드 
	static double pi = 3.14159;	
	
	static { // 정적 초기화 블럭. 생성자와 같은 역활 
		
	}
	
	// 정적 메서드 
	static int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	static int minus(int x, int y) {
		int result = x - y;
		return result;
	}
 	
	// 인스턴스 메서드 
	void setColor(String color) {
		this.color = color;
	}
}
