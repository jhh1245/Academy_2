package study._04_javaIO.output;

import java.io.IOException;
import java.io.OutputStream;

public class _01_MonitorOutput {

	public static void main(String[] args) throws IOException {
		// 입력표준 : System.in 
		// 출력표준 : System.out
		OutputStream os = System.out;
		
		// 문자 
		char ch = 'A';
		os.write(ch); // 출력 버퍼에 기록 
		os.write(66);
		
		System.out.println();
		
		// 문자열 
		String msg = "안녕하세요."; 
		// String -> byte[]
		byte[] msg_bytes = msg.getBytes(); // getBytes() : 바이트로 변환
		os.write(msg_bytes);
		System.out.println();
		
		// 정수 
		int age = 20; // '0' : 48
		// 모든값을 문자열로 변환 : String.valueOf(값)
		os.write(String.valueOf(age).getBytes());
		
		System.out.println();
		
		// 실수
		double body_length = 180.5;
		os.write(String.valueOf(body_length).getBytes());		
		
		System.out.println();
		
		// 논리형 
		boolean bOk = "파리".equals("새");
		os.write(String.valueOf(bOk).getBytes());
		
		// flush로 출력 버퍼를 비워야 모니터에 출력된다. 
		os.flush(); // 출력 버퍼를 비워라 -> 모니터로 전송 
		

	}

}
