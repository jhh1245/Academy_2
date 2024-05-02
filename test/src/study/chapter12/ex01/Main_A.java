package study.chapter12.ex01;

public class Main_A {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); // a.new를 해야한다. 
		
		b.field1 = 100;
		System.out.println(b.field1);
		b.method1();

	}

}
