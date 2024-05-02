package study.chapter04;

import java.util.Scanner;

public class ScannerExam01 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in); 
//		//Scanner()는 생성자임 Scanner 클래스 scanner 객체를 만든다.
//		//System.in을 매게변수로 넣음  
//		
//		System.out.print("문자열 입력 : ");
//		String a = sc.nextLine(); //문자열을 입력받겠다. 
//		System.out.println("입력받은 문자열 : " + a);
//		
//		
//		System.out.print("정수를 입력 : ");
//		int intValue = sc.nextInt();
//		System.out.println("입력받은 정수 : " + intValue);
//		
//		System.out.print("실수를 입력 : ");
//		double doubleValue = sc.nextDouble();
//		System.out.println("입력받은 정수 : " + doubleValue);
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("첫번째 정수 입력 : ");
//		int num1 = scanner.nextInt();
//		
//		System.out.println("두번째 정수 입력 : ");
//		int num2 = scanner.nextInt();
//		
//		if(num1 > num2) {
//			System.out.println(num1 + "이 더 큰수입니다.");
//		} else if (num2 > num1){ 
//			System.out.println(num2 + "이 더 큰수입니다.");
//		} else {
//			System.out.println("두 수는 같습니다.");
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("환전하고 싶은 원화를 입력하시오 : ");
//		int price = scanner.nextInt();
//		
//		double price2 = price / 1400.0;
//		
//		System.out.println(price + "원 환전 액수 = $" + price2);
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("환전하고 싶은 원화를 입력하시오 : ");
			
			int price = scanner.nextInt();
			if(price < 10000) {
				System.out.println("최소 환전 금액은 1만원 입니다.");
				continue;
			}
			
			double price2 = price / 1400.0;
			System.out.println(price + "원 환전 액수 = $" + price2);
			break;
		}
		
		
		
		
		
	}

}
