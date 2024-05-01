package study.chapter11.ex03;

public class AutoBoxingExam {
	public static void main(String[] args) {
		// 자동 박싱 
		Integer int1 = 100;
		// 값이 객체에 담길 수 없다. 
		// Interger a = Integer.valueOf(100); 
		// 이 과정이 생략되어 있는 것이다. 
		
		System.out.println(int1);
		
		
		
		// 자동 언박싱 
		int num = int1; 
		// 위의 코드가 실제로는 이렇다.
		// int num1 = int1.intValue(); //int1에 있는 값을 꺼내서 기본형에 담는다. 
		
		System.out.println(num);
		
		int result2 = int1 + num;
		// 객체 + 값도 가능하다. 
		System.out.println(result2);
		
		
		
		String str = "100";
		int num1 = Integer.parseInt(str);
		System.out.println(num1 + num1);
		
		Integer intValue = 100; 
		Integer intValue2 = 100;
		System.out.println(intValue == intValue2); //true 
		
		Integer intValue3 = 300; 
		Integer intValue4 = 300;
		System.out.println(intValue3 == intValue4); //false
		// -128 ~ 127까지 ==, != 가능하지만 범위 넘어서면 equals로만 비교가능
		System.out.println(intValue3.equals(intValue4)); // true 
		
		//  
		
		
		
		
		
		
	}
}
