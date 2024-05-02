package study.chapter08.ex9;

public interface Child2 extends Parent {

	@Override
	public default void method2() { //default메서드 재정의 
		System.out.println("ChlidInterface-method2()");
	}
	public void method3();

}
