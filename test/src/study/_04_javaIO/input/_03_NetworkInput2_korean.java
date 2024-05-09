package study._04_javaIO.input;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class _03_NetworkInput2_korean {

	public static void main(String[] args) throws Exception {
		String str_url = "https://www.naver.com/";
		URL url = new URL(str_url);
		
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is, "utf-8");
		
		int ch;
		int cnt = 0;
		
		while(true) {
			ch = isr.read(); 
			
			//파일 끝이면 종료 
			if(ch == -1) break;
			
			System.out.printf("%c", ch);
			cnt++;
		}
		System.out.printf("문자수 : %d\n", cnt);

	}

}
