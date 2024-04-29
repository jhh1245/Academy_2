package study.chapter10.ex09;

public class CharAtExam {

	public static void main(String[] args) {
//		String str = "자바프로그래밍";
//		char charVal = str.charAt(3);
//		System.out.println(charVal); 
//		
//		for(int i = 0; i < str.length(); i++) {
//			char result = str.charAt(i);
//			System.out.print(result);
//		}

		
		String strArr[] = {"123456-1234567", "123456-2234567", "123456-3234567", "123456-4234567", "123456-5234567"};
//		String ssn1 = "123456-1234567";
//		String ssn2 = "123456-2234567";
//		String ssn3 = "123456-3234567";
//		String ssn4 = "123456-4234567";
//		String ssn5 = "123456-5234567";
		char ch;
		for(int i = 0 ; i < strArr.length; i++) {
			ch = strArr[i].charAt(7);
			System.out.println(ch);
			if(ch == '1' ||ch == '3' ) {
				System.out.println("남자입니다.");
			} else if(ch == '2' ||ch == '4' ) {
				System.out.println("여자입니다.");
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
		
//		ch = strArr[0].charAt(7);
//		System.out.println(ch);
//		switch(ch) {
//		case'1':
//		case'3':
//			System.out.println("남자입니다.");
//			break;
//		case '2':
//		case '4':
//			System.out.println("남자입니다.");
//			break;
//		default:
//			System.out.println("잘못입력하셨습니다.");
//		}
	}

}
 