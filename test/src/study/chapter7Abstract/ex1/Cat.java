package study.chapter7Abstract.ex1;

public class Cat extends Animal{
	
	Cat(String name, int age) {
		super(name, age);
	}
	
	@Override 
	public void bark() {
		System.out.println("야옹");
	}
}
