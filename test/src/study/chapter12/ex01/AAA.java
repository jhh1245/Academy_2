package study.chapter12.ex01;


public class AAA {
	int a = 100;
	void methodB() {
		BBB b = new BBB();
		System.out.println("b : " + b.b);
	}
	
	class BBB{
		int b = 200;
		void methodA() {
//			AAA a = new AAA();
			System.out.println("a : " + a);
		}
	}
}


// 아래 Class BBB가 AAA 안으로 들어간 것이 중첩클래스 
//class BBB{
//	int b = 200;
//	void methodA() {
////		AAA a = new AAA();
//		System.out.println("a : " + a);
//	}
//}


//class CCC{
//	int c = 300;
//	void methodB() {
//		BBB b = new BBB();
//		System.out.println("b : " + b.b);
//	}
//}