package study.chapter11.ex01;

public class StringTrimExam {

	public static void main(String[] args) {
//		String str1 = "자바 프로그래밍";
//		String str2 = "   자바 프로그래밍   ";
//		
//		if(str1.equals(str2)) {
//			System.out.println("같은 객체입니다.");
//		} else {
//			System.out.println("다른 객체입니다.");
//		}
//		
//		String str3 = str2.trim();
//		if(str1.equals(str3)) {
//			System.out.println("같은 객체입니다.");
//		} else {
//			System.out.println("다른 객체입니다.");
//		}
		
		String str = String.valueOf(10);
		String str2 = String.valueOf(20.0);
		String str3 = String.valueOf(true);
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str + str2);
		
		int result1 = Integer.parseInt(str);
		double result2 = Double.parseDouble(str2);
		
		System.out.println(result1 + result2);
		System.out.println(result2);
	}

}
