package study.chapter7Instanceof.ex1;

public class Main {
	public static void mathodCasting1(Parent parent) { 
		// 여기서 parent가 될 수 있는 건 Parent 타입이거나 Parent를 상속받은 타입 둘 다 가능 
		Child child = (Child)parent;
		System.out.println("Child타입으로 변환 성공");
	}
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		Parent parent2 = new Parent();
		
		Child child = new Child();
		parent1 = child; // child가 대입된 parent1은 다시 child가 될 수 있다!!!!!!@@@@
		
		Main.mathodCasting1(parent1); // 캐스팅 가능
		Main.mathodCasting1(parent2); // 예외 발생 (ClassCastException)
	}
	
}