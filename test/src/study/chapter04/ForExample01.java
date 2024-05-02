package study.chapter04;

public class ForExample01 {

	//int a = 0; //이것은 전역변수이다.
	
	public static void main(String[] args) { //메인 메서드이기 때문에 	
		int a = 0; // 지역변수이다. 이 코드블럭 밖에서는 못쓴다. 
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Hello Java");
//			int sum = 0;
//		}
		
//		System.out.println("짝수");
//		for(int i = 0; i <= 10; i+=2) {
//			System.out.println("Hello Java" + i);
//		}
//		System.out.println("짝수");
//		for(int i = 0; i <= 10; i++) {
//			if(i % 2 == 0)
//			System.out.println("Hello Java" + i);
//		}
//		
//		System.out.println("홀수");
//		for(int i = 1; i <= 10; i+=2) {
//			System.out.println("Hello Java" + i);
//		}
		
		
//		int sum1 = 0;
//		int sum2 = 0;
//		int endNum = 100;
//		for(int i = 1; i <= endNum; i++) {
//			if(i % 2 == 0) {
//				sum1 += i;
//			} else {
//				sum2 += i;
//			}
//		}
//		
//		System.out.println("짝수 합 : " + sum1);
//		System.out.println("홀수 합 : " + sum2);
		
		
		
		
//		for(int i = 1; i <= 3; i++) {
//			System.out.println("외부 반복문" + i);
//			for(int k = 1; k <= 3; k++) {
//				System.out.println("             내부 반복문" + k);
//			}
//			System.out.println("외부 반복문" + i + " 종료");
//		}
//		System.out.println("반복문 종료");

//		System.out.println("구구단을 외자");
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//			System.out.println();
//		}
		
		
		System.out.println("한줄에 출력");
		for(int i = 1; i <= 10; i++) {
			if(i == 10) {
				System.out.println(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		
		System.out.println("\n한줄에 출력 2");
		for(int i = 10; i >= 1; i--) {
			System.out.print(i);
			
			if(i != 1) {
				System.out.print(", ");
			}
		}
	}

}
