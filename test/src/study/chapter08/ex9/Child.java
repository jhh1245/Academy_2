package study.chapter08.ex9;

public interface Child extends Parent {

	@Override
	public default void method2() {
		System.out.println("ChlidInterface-method2()");
	}
	public void method3();

}
