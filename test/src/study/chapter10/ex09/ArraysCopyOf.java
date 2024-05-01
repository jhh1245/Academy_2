package study.chapter10.ex09;

import java.util.Arrays;

public class ArraysCopyOf {
	public static void main(String[] args) {
		char[] charArr1 = {'J','A','V','A'};
		char[] charArr2 = Arrays.copyOf(charArr1, charArr1.length);
		System.out.println(Arrays.toString(charArr1));
		System.out.println(Arrays.toString(charArr2));
		
		String[] strArray = {"유재석", "강호동", "신동엽", "이수근", "아이유", "은지원"};
		String[] strArray2 = Arrays.copyOf(strArray, strArray.length);
		String[] strArray3 = Arrays.copyOfRange(strArray, 1, 5); // 1 ~ 5까지만 
		
		System.out.println(Arrays.toString(strArray));
		System.out.println(Arrays.toString(strArray2));
		System.out.println(Arrays.toString(strArray3));
	}
}
