package study._04_javaIO.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _02_FileInput {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("a.txt"); // 예외처리 throws
		// 업 캐스팅 

		int ch;
		while(true) {
			ch = is.read();
			
			// File의 끝이면 종료  
			if(ch == -1) break;
			System.out.printf("%c", ch);
			
			Thread.sleep(500);
		}
		is.close(); // 예외처리 throws 가장 최상위 = Exception
		System.out.println("\n --- End ---");
	}

}
