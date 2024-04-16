package study.chapter3;

public class OperEx04 {

	public static void main(String[] args) {
		String str1 = "JAVA";
		String str2 = "JAVA";
		String str3 = new String("JAVA");
		
		// 메모리 주소 비교
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		// 값을 비교. 메모리 주소 비교XX
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println();

	}

}
