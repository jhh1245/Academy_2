package study.chapter6.methodExam;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.add(10, 20);
		
		int result1 = cal.plus(100,200); 
		System.out.println(result1);
		
		double result2 = cal.divide(10,3); 
		System.out.println(result2);
	}

}
