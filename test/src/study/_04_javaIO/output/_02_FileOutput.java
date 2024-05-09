package study._04_javaIO.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class _02_FileOutput {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("b.txt"); 
		// 현재 프로젝트 폴더 

		// 문자 
		char ch = 'A';
		os.write(ch);
		
		// 문자열 
		String msg = "안녕?";
		os.write(msg.getBytes()); 
		// byte 단위로 출력 
		
		// 숫자 
		os.write(10); // enter 값 = 아스키코드 10 = txt파일에 엔터된다. 
		os.write('\n');
		os.write(String.valueOf(300).getBytes());
		
		// 실수 
		os.write('\n');
		os.write(String.valueOf(123.56).getBytes());
		
		// 편리하게 사용하기 위해서 filtering
		PrintStream out = new PrintStream(os);
		out.println("\n -- 지금부턴 PrintStream 이용합니다. --");
		
		String name = "홍길동";
		int age = 33; 
		boolean bMarried = false;
		out.printf("이름 : %s\n", name);
		out.printf("나이 : %d\n", age);
		out.printf("결혼유무 : %b\n", bMarried);
		out.printf("결혼 : %s",  bMarried? "기혼" : "미혼\n");
		
		out.println("-------------직렬화-------------");
		// CSV (Comma Separator Value)
		out.printf("%s, %d, %b\n", name, age, bMarried);
		
		// TSV (Tab Separator Value)
		out.printf("%s\t%d\t%b\n", name, age, bMarried);
		
		// 닫기 
		os.close();
	}

}
