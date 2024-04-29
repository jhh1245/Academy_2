package study.chapter10.ex09;

import java.util.Arrays;

public class ByteArray {
	public static void main(String[] args) {
		String str = "문자열스트링"; // 원래는 주소값이 나와야 하나, String에서 오버라이딩했다. 
		System.out.println(str);
		
		byte bytes[] = str.getBytes(); //문자열을 바이트로 변환 
		int result = bytes.length;
		System.out.println(result);  
		
		for(byte bytei : bytes) {
			System.out.println(bytei);
		}
		
		System.out.println(Arrays.toString(bytes)); 
		//Arrays 클래스가 가지고 있는 toString메소드로 bytes를 출력해라
		
	}
}
