package study.chapter11.ex01;

public class StringTimeExam {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis(); //밀리초 1000 분의 1초 
		
		
		String star = "*";
		String starSum = "";
		for (int i = 0; i < 200000; i++) {
			starSum += star;
		}
		
//		int sum = 0;
//		for (int i = 0; i < 1000000; i++) {
//			sum += i;
//		}
		
		long time2 = System.currentTimeMillis();
		// System.out.println("1부터 100만까지 합 : " + sum);
		System.out.println("걸린 시간 : " + (time2 - time1) + "밀리초 소요");

	}

}
