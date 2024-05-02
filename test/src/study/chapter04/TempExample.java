package study.chapter04;

public class TempExample {

	public static void main(String[] args) {
		// 숫자바꾸기
//		int num1 = 200;
//		int num2 = 100;
//		
//		int temp = 0;
//		
//		temp = num1;
//		num1 = num2;
//		num2 = temp;
//		
//		System.out.println("num1 : " + num1);
//		System.out.println("num2 : " + num2);
		
		//1 ~ 100 랜덤값 num1이 더 작은값이어야함 
		
		int num1 = (int)(Math.random() * 100) + 1;
		int num2 = (int)(Math.random() * 100) + 1;
		
		int temp = 0;
		
		System.out.println("전 : " + num1 + ", " + num2);
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("후 : " + num1 + ", " + num2);
		} else if (num2 > num1){
			System.out.println("변경사항없음");
		} else {
			System.out.println("두 수가 같음");
		}
		
		
		
	}

}
