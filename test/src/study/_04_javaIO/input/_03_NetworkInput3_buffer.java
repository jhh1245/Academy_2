package study._04_javaIO.input;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class _03_NetworkInput3_buffer {

	public static void main(String[] args) throws Exception {
		String str_url = "https://www.naver.com/";
		URL url = new URL(str_url);
		
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is, "utf-8");
		
		// 성능향상 
		BufferedReader br = new BufferedReader(isr);
		String data; // 한 줄 단위로 읽는다. 
		
		int line_cnt = 0;
		while(true) {
			data = br.readLine(); //Enter까지 읽어온다 = 엔터제외하고 넘긴다.
			
			if(data == null) break; 
			System.out.println(data);
			line_cnt++; 
			Thread.sleep(100);
		}
		
		System.out.printf("라인수 : %d", line_cnt);

	}

}
