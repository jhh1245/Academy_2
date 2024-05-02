package study.chapter09.ex1;

public class NullPointExceptionEx {
	
	public static void printLength(String data) {
//		try {
//			int result = data.length(); //여기서 예외
//			System.out.println("입력된 문자열 길이 : " + result);
//		} catch(NullPointerException e) { // 어떤거에서 예외가 발생했는지 
//			//System.out.println("NullPointerException 발생");	
//			//System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
//		} finally {
//			System.out.println("finally는 무조건 실행");
//		}
		
		if(data != null) {
			int result = data.length(); //여기서 예외
			System.out.println("입력된 문자열 길이 : " + result);
		} else {
			System.out.println("입력된 data값이 Null입니다.");
		}

	}
	
	public static void main(String[] args) {
//		String data = null;
//		System.out.println(data);
//		System.out.println(data.toString()); //가지고 있는 값을 문자열로 바꿔라 but 값이 없어서 에러
		
		System.out.println("프로그램 시작");
		//NullPointExceptionEx.printLength("ddddd");
		
		printLength(null);
		// 실행되기 전까지는 에러인지 모른다.
		
		printLength("지금은 7교시다");
		System.out.println("프로그램 종료");
	}
}
