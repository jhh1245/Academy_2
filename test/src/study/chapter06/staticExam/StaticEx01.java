package study.chapter06.staticExam;

public class StaticEx01 {
	// 인스턴스 필드
	int field1;
	void method1() {
		System.out.println("인스턴스 메소드를 호출합니다.");
	}
	
	// 정적 필드, 정적 메서드 
	static int field2;
	static void method2() {
		System.out.println("정적 메소드를 호출합니다.");
	}
	
	static { // 위에 선언한 것들 사용 가능하다 .
		// field1 = 10;
		// method1();
		// 두개는 객체가 있어야 사용가능해서 여기서 초기화 불가함
		
		field2 = 20;
		method2(); 
	}
	
	static void method3() {
		// this.field1 =30; // 안된다. 

		// 굳이 사용하고 싶다면 객체 만들어서 사용 
		StaticEx01 se = new StaticEx01();
		se.field1 = 10;
		se.method1();
		
		field2 = 100;
		method2();
	}

}
