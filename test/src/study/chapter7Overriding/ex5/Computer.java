package study.chapter7Overriding.ex5;

public class Computer extends Calculator {

	
	@Override 
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 메서드 호출");
		return Math.PI * r * r ;
	}

}
