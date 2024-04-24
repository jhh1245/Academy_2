package study.chapter7Casting.ex8;

public class Child extends Parent {
	String field2;
	
	@Override
	public void method2() {
		System.out.println("Child의 method2() 메서드 호출");
	}
	
	public void method3() {
		System.out.println("Child의 method3() 메서드 호출");
	}
}
