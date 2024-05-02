package study.chapter06.pkgEx03.ex1;

public class ClassB { //public
	public ClassB() {
		ClassA ca = new ClassA();
		ca.field1 = 10; 
		ca.field2 = 20;
		// ca.field3 = 30; // 접근제한자 private. 같은 클래스내에서만 접근 가능 
		
		ca.method1();
		ca.method2();
		// ca.method3(); // 접근제한자 private. 같은 클래스내에서만 접근 가능 
	}
	
}
