package study._04_javaIO.input;

import java.io.InputStream;
import java.net.URL;

public class _03_NetworkInput {

	public static void main(String[] args) throws Exception {
		String str_url = "https://www.naver.com/";
		URL url = new URL(str_url);
		
		InputStream is = url.openStream();
		
		int ch;
		
		while(true) {
			ch = is.read();
			
			//파일 끝이면 종료 
			if(ch == -1) break;
			
			System.out.printf("%c", ch);
		}

	}

}
