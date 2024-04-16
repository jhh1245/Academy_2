package study.chapter4;

public class TempExample {

	public static void main(String[] args) {
		// 숫자바꾸기
		int num1 = 200;
		int num2 = 100;
		
		int temp = 0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
	}

}
