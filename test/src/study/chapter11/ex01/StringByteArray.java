package study.chapter11.ex01;

import java.nio.charset.Charset;

public class StringByteArray {

	public static void main(String[] args) {
		byte byteValue[] = {104, 101, 108, 108, 111}; // byte 배열
		
		// String() 
		String str1 = new String();
		System.out.println("1 기본생성자 : " + str1);
		
		// String("문자열")
		String str2 = new String("홍길동");
		System.out.println("2 : " + str2);
		
		// String(byte[] byte)
		String str3 = new String(byteValue); // 바이트 배열을 String으로 변환
		System.out.println("3 : " + str3);
		
		
		// String(byte[] byte, charSet)
		String str4 = new String(byteValue, Charset.forName("ASCII")); 
		System.out.println("4 : " + str4);
		
		// String(byte[] byte, int offset, int length) 특정 부분만 문자열로 바꾸고 싶다. 시작인덱스, 몇개를 
		String str5 = new String(byteValue, 3, 2);
		System.out.println("5 : " + str5);
		
		// String(byte[] byte, int offset, int length, charSet) 
		String str6 = new String(byteValue, 3, 2, Charset.forName("ASCII"));
		System.out.println("6 : " + str6);
				
		

	}

}
