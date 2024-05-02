 package study.chapter06.pkgEx03.ex1;

public class ClassA { 			  // public   
	
	public int field1; 		// public
	int field2;				// default
	private int field3;		// private
	
	
	public void method1() { //public
		System.out.println("method1() 호출");
	}
	
	void method2() { 		//default
		System.out.println("method2() 호출");
	}
	
	private void method3() {		//private 
		System.out.println("method3() 호출");
	}
	
	// 생성자 
	public ClassA() {
		field1 = 1; // public
		field2 = 2; // default
		field3 = 3; // private
		
		method1();
		method2();
		method3();
	}
}
