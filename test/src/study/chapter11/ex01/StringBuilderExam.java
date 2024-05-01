package study.chapter11.ex01;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// 기본값 16개 문자열을 저장하는 초기 버퍼를 생성
		System.out.println(sb.length());
		sb.append("Java ");
		System.out.println(sb.toString());

		sb.append("program Study");
		System.out.println(sb.toString());
		
		// 인덱스 번호에 문자열 추가 
		sb.insert(2, "bbb");
		System.out.println(sb);
		
		// 인덱스 번호의 문자열 변경
		sb.setCharAt(4, 'k');
		System.out.println(sb);
		
		// 0~6까지 C로 바꾼다.
		sb.replace(0, 7, "C");
		System.out.println(sb);
		
		sb.delete(0,  10);
		System.out.println(sb);
		
		int sbLength = sb.length();
		System.out.println("문자열 길이 : " + sbLength);
	}

}
