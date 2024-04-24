package study.chapter7Casting.ex8;

public class Main {

	public static void main(String[] args) {
		Parent p = new Child();
		
		p.field1 = "data1";
		System.out.println(p.field1);
		
		p.method1();
		
		p.method2(); // 자식에서 오버라이딩한 메서드를 호출한다. 
		
		// p.method3(); // p는 타입이 Parent 타입임으로 Child 클래스에 있는 method3은 접근 못한다.
		
		// p.field2 = "이것도안된다."; 
		
		// Child child = p; //자동변환이 안됨으로 앞에 괄호로 묶어줘야 한다. 
		Child child = (Child)p;
		
		// 정리 : 부모 필드, 메서드와 자식의 필드, 메서드 모두 접근 가능! 자식과 부모가 똑같은 메서드를 가지고 있을 땐 오버라이딩한 메서드로 접근!!!  
		
		child.field2 = "data2"; // 자식의 필드 접근 가능 
		System.out.println(child.field2);
		child.method3(); // 자식의 메서드 사용 가능 
		
		System.out.println(child.field1);
		child.method1(); // 부모 
		child.method2(); // 자식이 오버라이딩한 메서드 호출 
	
		
		
		
		Parent p2 = new Parent();
		// Child child2 = (Child)p2; 
		// 에러 : 클래스를 케스팅하는데 에러 but 컴파일 에러가 아니라 런타임에러다. ( java.lang.ClassCastException )
		// 실행해봐야 확인할 수 있는 에러다. 
		// 이 밑에 있는 실행문은 실행이 안된다. 

	}

}
