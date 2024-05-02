package study.chapter12.ex02;

public class A {
	static class C{
		int field1; 
		static int field2;
		
		C(){
			System.out.println("C 클래스의 객 체 생 성");
		}
		
		static void method() {
			System.out.println("C 클래스의 정적 메서드 호출");
		}
	}
}
