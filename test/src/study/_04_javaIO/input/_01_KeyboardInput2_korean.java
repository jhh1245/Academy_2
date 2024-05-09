package study._04_javaIO.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _01_KeyboardInput2_korean {

	public static void main(String[] args) throws IOException {
		int ch;
		
		InputStream is = System.in;
		
		// 한글이 깨지니까 byte -> char로 변환시킬 filter 필요
		InputStreamReader isr = new InputStreamReader(is);
		
		System.out.println("데이터를 입력하세요 (종료 : Ctrl + z) ");
		
		while(true) {
			ch = isr.read(); 
			// 키보드가 아니라 isr로 부터 문자 1개 (2byte, char형)으로 받는다.  
			
			if(ch == -1) break; 
			System.out.printf("%c", ch); 
			 
		}
		System.out.println("--- End ---"); 

	}

}
