package study.chapter07Poly.ex2;

public class Child extends Parent {

	@Override
	void method2() { // 부모꺼 오버라이딩 
		System.out.println("Child의 method2() 메서드 호출");
	}
	
	
	void method3() {
		System.out.println("Child의 method3() 메서드 호출");
	}

}
