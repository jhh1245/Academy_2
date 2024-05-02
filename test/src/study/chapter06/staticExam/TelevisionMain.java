package study.chapter6.staticExam;

public class TelevisionMain {
	public static void main(String[] args) {
		System.out.println(Television.info); // 객체 만들 필요 X 
		
		String result = Television.info;
		System.out.println();
		
		System.out.println(Television.from1To10Sum);
		int result2 = Television.from1To10Sum;
		System.out.println(result2);
	}
}
