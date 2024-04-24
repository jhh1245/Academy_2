package study.chapter7Abstract.ex1;

public class Dog extends Animal{
	// 기본적으로 super()를 가지고 있음 
	
	Dog(String name, int age) {
		super(name, age);
	}
	
	@Override 
	public void bark() {
		System.out.println("멍멍");
	}
}
