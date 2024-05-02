package study.chapter08.ex9;

public interface Parent {
	void method1();
	default void method2() {
		System.out.println("ParentInterface-method2()");
	}
}
