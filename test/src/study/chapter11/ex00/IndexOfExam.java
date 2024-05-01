package study.chapter11.ex00;

public class IndexOfExam {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		//int index = str1.indexOf("프로");
		
		String str2 = "파이썬 프로그래밍";
		String str3 = "C언어 프로그래밍";
		
		String book = str2;
		if(-1 != str2.indexOf(book)) {
			System.out.println(book + "교제입니다.");
		} else {
			System.out.println(book + "교제가 아닙니다.");
		}
	}

}
