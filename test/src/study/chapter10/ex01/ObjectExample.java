package study.chapter10.ex01;

public class ObjectExample {

	public static void main(String[] args) {
		// 논리적 동등 : 객체는 다르더라도 안에있는 값이 같은 경우 동등하다고 판단 
		
//		String str1 = new String("자바");
//		String str2 = new String("자바");
//		String str3 = new String("자바");
//		
//		boolean result1 = str1 == str2; // 주소값
//		boolean result2 = str1 == str3;
//		boolean result3 = str2 == str3;
//		
//		
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//
//		boolean result11 = str1.equals(str2); // 안에 값
//		boolean result22 = str1.equals(str3);
//		boolean result33 = str3.equals(str2);
//		
//		System.out.println(result11);
//		System.out.println(result22);
//		System.out.println(result33);
		
		
		
		
		Object obj1 = new Object(); 
		Object obj2 = obj1; // 주소값 대입 
		
		boolean result111 = obj1 == obj2; // 주소
		System.out.println(result111); // true
		
		boolean result222 = obj1.equals(obj2); // 주소 
		System.out.println(result222); // true
		
		Object obj3 = new Object();
		Object obj4 = new Object();
		
		boolean result333 = obj3 == obj4; // 주소 
		System.out.println(result333); // false
		
		boolean result444 = obj3.equals(obj4); // false !! 왜냐면 주소값 비교니까 
		System.out.println(result444);
		
		
	}

}
