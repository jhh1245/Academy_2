package study.chapter07.ex4;

public class ClassA {
	void method1() {
		System.out.println("method1 호출 ");
		method2();
		System.out.println("method1 종료 ");
	}
	
	void method2() {
		System.out.println("method2 호출 ");
		method3();
		System.out.println("method2 종료 ");
	}
	
	void method3() {
		System.out.println("method3 호출 ");
		method4();
		System.out.println("method3 종료 ");
	}
	
	void method4() {
		System.out.println("method4 호출 ");
		System.out.println("method4 종료 ");
	}
	
}
