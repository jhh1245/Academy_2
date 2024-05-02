package study.chapter03;

public class OperEx03 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = num1 == num2;
		boolean result2 = num1 != num2;
		
		System.out.println(result1);
		System.out.println(result2);
		
		char ch1 = 'A'; // 자바는 문자를 유니코드로 저장 'A' = 65 
		char ch2 = 'B';
		
		boolean result3 = ch1 == ch2;
		boolean result4 = ch1 != ch2;
		boolean result5 = ch1 < ch2; //true 
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);

	}

}
