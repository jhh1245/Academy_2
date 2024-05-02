package study.chapter08.ex8;

public class InterfaceMain {
	public static void main(String[] args) {
		ImplementsClass impl = new ImplementsClass(); 
		 
		interfaceA ia = impl; // 인터페이스는 객체를 만들 수 없어서 대입을 한다.
		// Product p = smartTv; 랑 비슷하다고 생각하면 됨  
		ia.methodA1(); // A 인터페이스에 있는 2개 메서드만 가능 . Product에만 있는 메서드 쓸 수 있는거랑 같은 내용 
		ia.methodA2();
		System.out.println();
		
		interfaceB ib = impl;
		ib.methodB1();
		ib.methodB2();
		System.out.println();
		
		interfaceC ic = impl;
		ic.methodC1();
		ic.methodC2();
		System.out.println();
	}
}
