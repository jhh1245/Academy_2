package study.chapter7Poly.ex2;

public class Main {
	public static void main(String[] args) {
		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
		// parent.method3(); //컴파일에러 
		
		System.out.println();
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		Parent parent2 = child; 
		parent2.method1();
		parent2.method2(); // 부모 메소드가 아닌 자식에서 오버라이딩 한 메소드가 호출된다. 
		// parent2.method3();  // 타입이 Parent니까 method 1, 2밖에 못쓴다. 
		
	}
}
