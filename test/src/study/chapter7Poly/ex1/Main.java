package study.chapter7Poly.ex1;

public class Main {
	public static void main(String[] args) {
		
		ClassB b = new ClassB();
		ClassC c = new ClassC();
		ClassD d = new ClassD();
		ClassE e = new ClassE();
		
		ClassA a1 = b; 
		ClassA a2 = c;
		ClassA a3 = d;
		ClassA a4 = e;
		
		ClassB b2 = d;
		ClassC c2 = e;
		 
		System.out.println("a1 == b : " + (a1 == b));
		System.out.println("b2 == d : " + (b2 == d));
	}
}
