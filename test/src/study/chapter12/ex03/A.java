package study.chapter12.ex03;

public class A {
	
	void methodA() { 
		class D {		
			// 외부에서는 D클래스에 바로 접근 불가. 메소드 A는 잠깐 메모리에 올라갔다 지워지기 때문에 
			int field1;
			
			D(){
				System.out.println("D 클래스의 객체 생성");
			}
			
			void methodD() {
				System.out.println("D 클래스의 메서드 호출");
			}
		}
		D d = new D(); 	// 메소드 안에서는 객체 생성 가능 
		d.field1 = 100;
		d.methodD();
		
	}
	
	//D d = new D(); // 메소드 밖에서는 접근 불가함 
}
