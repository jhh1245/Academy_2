package study.chapter11.ex01;

public class StringReplaceExam {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다."; 
		// oldStr = "JAVA 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		// 로 바꾸면 객체를 다시 만드는 것이다 
		
		String newStr = oldStr.replace("자바", "JAVA");
		// 이렇게하면 원본 값을 바꿀 수 있다. 
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String original = "Java Programming";
		String lowerCase = original.toLowerCase();
		String upperCase = original.toUpperCase();
		System.out.println(original);
		System.out.println(lowerCase);
		System.out.println(upperCase);
		
		String lowerStr1 = original.toLowerCase();
		String lowerStr2 = original.toLowerCase();
		
		
		
		if(lowerStr1 == (lowerStr2)) { // 다른 주소값을 가짐 
			System.out.println("같은 객체입니다.");
		} else { 
			System.out.println("다른 객체입니다.");
		}
		
		
		
		
	}
}
