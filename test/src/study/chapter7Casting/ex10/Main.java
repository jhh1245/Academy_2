package study.chapter7Casting.ex10;

public class Main {
	public static void mathodCasting1(Parent parent) { 
		// 여기서 parent가 될 수 있는 것 : Parent 타입이거나 Parent를 상속받은 타입 둘 다 가능 
		Child child = (Child)parent;
		System.out.println("Child 타입으로 변환 성공");
	}
	
	public static void mathodCasting2(Parent parent) { 
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("Child 타입으로 변환 성공");
		} else {
			System.out.println("Child 타입으로 변환할 수 없습니다.");
		}
	}
	
	
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		Parent parent2 = new Parent();
		
		Child child = new Child();
		parent1 = child; // child가 대입된 parent1은 다시 child가 될 수 있다!!!!!!@@@@
		
		//Main.mathodCasting1(parent1); // 캐스팅 가능
		//Main.mathodCasting1(parent2); // 예외 발생 (ClassCastException)
		
		boolean result1 = parent1 instanceof Parent;
		boolean result2 = parent2 instanceof Parent;
		boolean result3 = parent1 instanceof Child;
		boolean result4 = parent1 instanceof Child;
		boolean result5 = child instanceof Child;
		boolean result6 = child instanceof Parent; 
		// child는 Parent 타입이다. 그래서 child가 Parent 타입에 대입이 된다.
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		
		Main.mathodCasting2(parent1); // 캐스팅 가능
		Main.mathodCasting2(parent2); // 예외 발생하지 않음!!   
	}
	
}