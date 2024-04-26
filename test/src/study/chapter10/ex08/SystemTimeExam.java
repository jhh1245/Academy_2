package study.chapter10.ex08;

public class SystemTimeExam {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		System.out.println(startTime);

		int sum = 0;
		for(int i = 0; i <= 1000000; i++) {
			sum += i;
		}
		
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime + "나노 초가 소요되었습니다.");
		System.out.println((((double) (endTime - startTime)) / 1000000000) + "초 소요");
		System.out.println("총 합 : " + sum);
	}

}
