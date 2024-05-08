package study.review;

// 1. 추상 메소드를 포함한 클래스는 반드시 추상클래스여야 한다. 
// 2. 추상 클래스는 반드시 추상 메소드를 포함하지 않을 수 있다. 
// 3. 추상 클래스는 객체 생성 못한다. 
// 4. 추상 메소드를 포함한 클래스 상속시, 무조건 재정의 해야한다. 
abstract class Shape{
	
	abstract void draw();
}

class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("■");
		
	}
}

class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("●");
		
	}
}

class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("▲");
		
	}
}

public class AbstractExam {

	public static void main(String[] args) {
		// new AbstractClass();

		Shape[] shape_arr = {new Rectangle(), new Triangle(), new Circle()};
		
		for(Shape s : shape_arr) {
			s.draw();
		}
	}

}
