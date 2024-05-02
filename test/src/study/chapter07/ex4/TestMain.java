package study.chapter07.ex4;

public class TestMain {

	public static void main(String[] args) {
		Child ch = new Child();
		//ch.method();
		
		ch.setParent("부모클래스", 100);
		ch.setChild("자식클래스", 50);
		
		ch.method();

	}

}
