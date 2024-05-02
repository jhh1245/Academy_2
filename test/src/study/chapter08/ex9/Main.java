package study.chapter08.ex9;

public class Main {

	public static void main(String[] args) {
		
		Child ci1 = new Child() {

			@Override
			public void method1() {
				System.out.println("ci1-method1");
				
			}

			// 메소드2는 디폴트라 오버라이딩 필수 아님 
			@Override
			public void method3() {
				System.out.println("ci1-method3");
				
			}
			
		}; // 구현 클래스를 익명으로 만들었다. 
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		System.out.println();
		Child2 ci2 = new Child2() {

			@Override
			public void method1() {
				System.out.println("ci2 - method1");
			}

			@Override
			public void method3() {
				System.out.println("ci2 - method3");
				
			}
			
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		
		System.out.println();
		Child3 ci3 = new Child3(){

			@Override
			public void method1() {
				System.out.println("ci3 - method1");
				
			}
			@Override
			public void method2() {
				System.out.println("ci3 - method2");
				
			}
			@Override
			public void method3() {
				System.out.println("ci3 - method3");
				
			}
			
		};
		
		
		ci3.method1();
		ci3.method2();
		ci3.method3();

		}

}
