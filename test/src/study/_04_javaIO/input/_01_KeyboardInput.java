package study._04_javaIO.input;

import java.io.IOException;
import java.io.InputStream;

public class _01_KeyboardInput {

	public static void main(String[] args) throws IOException {
		int ch;
		
		InputStream is = System.in;
		
		System.out.println("데이터를 입력하세요 (종료 : Ctrl + z) ");
		int cnt = 0;
		
		while(true) {
			ch = is.read(); // 이 메소드는 숫자로 받는다. 
			// 키보드 버퍼로부터 1byte 읽어오기 
			// 예외처리 해야함 키보드로부터 못 읽어올 경우 main()메소드에게 던진다. = 여기서 예외처리 하지 않겠다. 
			
			
			if(ch == -1) { // ctrl + z 누르면 => is.read()가 -1을 반환 
				break; 
			}
			
			System.out.printf("%c %d", ch, ++cnt); // ch = int 형인데 char로 출력 
			 
		}
		System.out.println("--- End ---"); // println (line next)

	}

}
