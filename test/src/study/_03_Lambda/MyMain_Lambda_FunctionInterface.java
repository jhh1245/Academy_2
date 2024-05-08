package study._03_Lambda;

@FunctionalInterface

interface MyMath{
	int calc(int a, int b);
}
// 인터페이스를 만들고 아래 처럼 람다식으로 쓴다. 

// 람다식 : 클래스를 따로 안 만들고 그 때 그 때 만들겠다.
// 우리가 람다식으로 쓰면 JVM이 알아서 만들어준다. 

// 주의!! 
// For문으로 람다식을 쓰면 객체가 많이 만들어져서 성능이 떨어진다. 
// 람다식 쓰려면 인터페이스 안에 추상메서드가 1개만 있어야 한다. 
// 여러 개가 있으면 어떤 메소드를 써야하는지 모른다. ??? 
// int cal2(int a, int b, int c); 를 추가할 경우 사용하는 쪽에서  



public class MyMain_Lambda_FunctionInterface {

	public static void main(String[] args) {
		MyMath plus = (a,b) -> a + b; // 위에 MyMath 인터페이스에서 선언한 메소드 형태로 
		MyMath minus = (a, b) -> a - b;
		MyMath multi = (int a, int b) -> a * b;
		MyMath divide = (a, b) -> { return (b == 0)? 0 : a / b; };
		
//		MyMath remain = ((a, b) -> { //return 이 있으면 {} 있어야 한다. 
//			if(b != 0) {
//				return a % b;
//			}
//			return 0;
//		});
		
		MyMath remain = (a, b) -> { return (b == 0)? 0 : a % b; } ; //return 이 있으면 {} 있어야 한다. 
		
		int a = 10, b = 3;
		System.out.printf("%d + %d = %d\n", a, b, plus.calc(a, b));
		System.out.printf("%d - %d = %d\n", a, b, minus.calc(a, b));
		System.out.printf("%d * %d = %d\n", a, b, multi.calc(a, b));
		System.out.printf("%d / %d = %d\n", a, b, divide.calc(a, b));
		System.out.printf("%d %% %d = %d\n", a, b, remain.calc(a, b)); // %가 문자로 인식되려면 %%로 입력해야 %가 출력된다.
		
		// public int plus(int a, int b) {
		// 		return a + b; 
		// }
		// 이 내용을 생략한 것이다. 
		
	}
}
