 package study.chapter06.pkgEx02.ex2;

import study.chapter06.pkgEx02.ex1.ClassA;
import study.chapter06.pkgEx02.ex1.ClassB;

public class ClassC { // default 접근 제한자 (같은 패키지만 접근 가능)
	
	ClassA a1 = new ClassA(10);   // public
	// ClassA a2 = new ClassA(10.0); // default (ClassA와 같은 패키지가 아님으로 생성자 호출 불가능!!) 
	// ClassA a3 = new ClassA("10"); // private (ClassA와 같은 클래스 내에서만 호출가능) 

}
