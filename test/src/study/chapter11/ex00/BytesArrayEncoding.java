package study.chapter11.ex00;

import java.io.UnsupportedEncodingException;

public class BytesArrayEncoding {

	public static void main(String[] args) {
		String str = "문자열스트링";		// 임의의 문자열 생성 
		byte[] bytes1 = str.getBytes();	// 문자열을 바이트 배열로 변환하여 대입 
		
		
		String str1 = new String(bytes1); //바이트 배열을 매개변수로 String 문자열을 생성
		System.out.println("str1 : " + str1);
		System.out.println("바이트 배열 길이 : " + bytes1.length);
		
		
		try {
			byte[] bytes2 = str.getBytes("UTF-8"); // 문자열을 바이트 배열로 인코딩방식으로
			String str2 = new String(bytes2, "UTF-8");
			System.out.println("str2 : " + str2);
			System.out.println("바이트 배열 길이 : " + bytes2.length);
		} catch (UnsupportedEncodingException e) { // 매개변수로 준 인코딩 방식이 없을 때 예외 발생 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		 try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			String str3 = new String(bytes3, "EUC-KR");
			System.out.println("str3 : " + str3);
			System.out.println("바이트 배열 길이 : " + bytes3.length);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 try {
			byte[] bytes4 = str.getBytes("UTF-8"); // utf8방식으로 byte배열을 -> string 
			String str4 = new String(bytes4, "EUC-KR"); // euc-kr 방식으로 byte배열을 -> string 
			System.out.println("str4 : " + str4); //깨진다!! 
			System.out.println("바이트 배열 길이 : " + bytes4.length);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
