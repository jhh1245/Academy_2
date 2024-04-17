package study.chapter4;

public class WhileExample01 {

	public static void main(String[] args) {  	
//		int i = 1;
//		int sum = 0;
		
//		while(i <= 10) {
//			System.out.println(i);
//			sum += i;
//			i++;
//		}
//		System.out.println("1부터 10까지의 합 : " +sum);
		
//		while(i <= 100) {
//			if(i % 2 != 0) {
//				sum += i;
//				System.out.print(i + " ");
//			}
//			i++;
//		}
//		System.out.println("1부터 100까지의 홀수의 합 : " + sum);

		// while로 구구단 
//		int i = 2;
//		int j = 1;
//		
//		while(i < 10) {			
//			while(j < 10) {
//				System.out.println(i + " * " + j + " = " + i * j);
//				j++;
//			}
//			j = 1;
//			System.out.println();
//			
//			i++;
//		}
		
		int i = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		while(i <= 100) {
			if(i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
			i++;
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		
		do {
			System.out.println(i);
		} while (i < 3);
		System.out.println("do while 종료");
		
	}

}
