package study.chapter12.ex01;

public class A { 	// 외부1 클래스 
	A() { 			// 생성자 
		System.out.println("A클래스의 객체 생성됨 ");
	}
	
	class B { 		// 내부클래스 (인스턴스 멤버클래스) static 없이 선언되었으니까  
		//A 객체 없이는 B에 접근 불가하다. 
		int field1; // 필드 
		B(){		// 생성자 
			System.out.println("B클래스의 객체가 생성됨");
		}
		
		void method1() {
			System.out.println("B클래스 메서드 호출 ");
		}
		
	}
}
