package study.chapter07.ex4;

public class Child extends Parent{
	int age;
	String name;
	
	void method() {
		System.out.println("this.age : " + this.age);
		System.out.println("super.age : " + super.age);
		
		System.out.println("this.name : " + this.name);
		System.out.println("super.name : " + super.name);
	}
	
	void setParent(String name, int age) {
		super.name = name;
		super.age = age;
	}
	
	void setChild(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
