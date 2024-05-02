package study.chapter06.pkgEx02.ex1;

public class ClassB { //public

	ClassA a1 = new ClassA(10);   // public
	ClassA a2 = new ClassA(10.0); // default (ClassA와 같은 패키지임으로 생성자 호출가능) 
	// ClassA a3 = new ClassA("10"); // private (ClassA와 같은 클래스 내에서만 호출가능) 
	
	
	
}
