 package study.chapter6.pkgEx03.ex2;

import study.chapter6.pkgEx03.ex1.ClassB;
import study.chapter6.pkgEx03.ex1.ClassA;

public class ClassC { // default 접근 제한자 (같은 패키지만 접근 가능)
	
	public ClassC() {
		ClassA ca = new ClassA();
		ca.field1 = 10; 
		// ca.field2 = 20;    // 접근제한자 default. 같은 패키지에서만 접근 가능 
		// ca.field3 = 30; // 접근제한자 private. 같은 클래스내에서만 접근 가능 
		
		ca.method1();
		// ca.method2(); // 접근제한자 default. 같은 패키지에서만 접근 가능
		// ca.method3(); // 접근제한자 private. 같은 클래스내에서만 접근 가능 
	}
}
