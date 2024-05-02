package study.chapter05;

public class ArrayExam05 {

	public static void main(String[] args) {
		int number[] = {1,2,3,4,5,6};
		
		for(int i = 0; i < number.length; i++) {
			int num = number[i];
			System.out.println(num + " ");
		}
		
		// 향상된 for문
		System.out.println("향상된 for문");
		// 배열 안의 타입 : 배열이름
		for(int num1 : number) {
			System.out.println(num1);
		}

	}

}
