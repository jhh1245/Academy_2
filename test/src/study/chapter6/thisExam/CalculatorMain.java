package study.chapter6.thisExam;

public class CalculatorMain {

	public static void main(String[] args) {
		
		int result1 = Calculator.plus(3, 5);
		int result2 = Calculator.minus(3, 5);
	
		double result3 = Calculator.pi * 10 * 10;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		Calculator cal = new Calculator();
		cal.speed = 10;
		System.out.println(cal.speed);
		
		// 정적멤버변수가 아니라 이렇게는 접근 불가하다. 객체를 만들어야한다!! 
		// Calculator.speed;
		
		int result4 = (int)(Math.random()); 
		// 클래스명 Math, random()메서드는 static이다. 
		// 객체 안만들고 바로 사용 할 수 있으니까 
		
		
		Calculator cal1 = new Calculator();
		cal1.setColor("검정색");
		
		Calculator cal2 = new Calculator();
		cal2.setColor("파란색");
	}
}