package study.chapter4;

public class testest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int sum = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		//2
//		int sum = 0;
//	
//		while(true) {
//			int num1 = (int)(Math.random() * 6) + 1;
//			int num2 = (int)(Math.random() * 6) + 1;
//			
//			sum = num1 + num2;
//			
//			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
//			
//			if(sum == 5) {
//				break; 
//			} else {
//				sum = 0;
//			}
//		}
		
//		// 7
//		int rows = 5; 
//		
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
//		int rows = 5;
//		String star = "";
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0; j < i; j++) {
//				star += '*';
//				System.out.print(star);
//				star = "";
//			}
//			System.out.println();
//		}
		
		
		//8
//		int sum = 0;
//		
//		for(int i = 1; i <= 20; i++) {
//			if(i % 2 == 0 || i % 3 == 0) {
//				continue;
//			} else {
//				sum += i;
//				System.out.println(i);
//			}
//		}
//		System.out.println("1 ~ 20까지의 숫자 중 2,3의 배수만 빼고 합한 값 : " + sum);
		
//		int sum = 0;
//		int i = 1;
//		
//		while(true) {
//			if(i % 2 != 0 && i % 3 != 0) {
//				sum += i;
//			}
//			if(i == 20) {
//				break;
//			}
//			i++;
//		}
//		System.out.println("1 ~ 20까지의 숫자 중 2,3의 배수만 빼고 합한 값 : " + sum);
//		
		
		//9
//		
//		for(int i = 1; i <= 100; i++) {
//			int kor = (int)(Math.random() * 71) + 30;
//			int math = (int)(Math.random() * 71) + 30;
//			int eng = (int)(Math.random() * 71) + 30;
//			int sum = kor + math + eng;
//			double avg = sum / 3.0;
//			
//			
//			if(avg >= 80.0) {
//				System.out.println("========================");
//				System.out.println("학생번호 : " + i);
//				System.out.println("국어점수 : " + kor);
//				System.out.println("수학점수 : " + math);
//				System.out.println("영어점수 : " + eng);
//				System.out.println("총 점수 : " + sum);
//				System.out.println("평점 : " + avg);
//			}	
//		}

		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(i > 20) {
				break;
			}
			i++;
			
			if(i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			
			sum += i;
			
		}
		System.out.println("1 ~ 20까지의 숫자 중 2,3의 배수만 빼고 합한 값 : " + sum);
		
	}

}
