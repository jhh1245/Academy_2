package study.chapter09.ex1;

public class NumberFormatExceptionEx {
	public static void main(String[] args) {
		String str1 = "100";
		int val1 = Integer.parseInt(str1);
		System.out.println(val1); // 100
		
		str1 = "abc";
		System.out.println(Integer.parseInt(str1));
	}
}
