package study.chapter11.ex01;

import java.util.StringTokenizer;

public class StringSplit {

	public static void main(String[] args) {
//		String text = "유재석&박명수,아이유&지드래곤/빅뱅-이수근,이승기-강호동";
//		String[] names = text.split("&|,|-|/"); //split()메서드를 사용하여 문자열 분리
//		// & or , or - or / 을 사용해 분리 
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		String text = "유재석/박병수/아이유/지디/빅뱅/이수근/이승기/강호동";
		StringTokenizer st = new StringTokenizer(text, "/"); 
		// text를 /로 자른다.
		
		
		int countToken = st.countTokens();
		System.out.println("현재 토큰 수 : " + countToken); // 8개를 꺼낼 수 있다. 
		
//		boolean moreToken = st.hasMoreTokens(); 
//		System.out.println(moreToken);
		
		// for 방법 
		String[] strArr = new String[countToken];
		for(int k = 0; k < countToken; k++) {
			String str = st.nextToken();
			strArr[k] = str;
			System.out.println(strArr[k]);
		}
		
		// while 방법 
//		String[] strArr2 = new String[countToken];
//		int i = 0;
//		while(st.hasMoreTokens()) {
//			String token = st.nextToken();
//			strArr2[i++] = token; 
//		}
//		for(int j = 0; j < strArr2.length; j++) {
//			System.out.println(strArr2[j]);
//		}
	}

}
