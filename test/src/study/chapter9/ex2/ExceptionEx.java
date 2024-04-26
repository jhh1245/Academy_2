package study.chapter9.ex2;

public class ExceptionEx {
	public static void findClass(String className) throws ClassNotFoundException {
		//Class.forName("java.lang.String"); // 이거 쓰고 자동완성으로 try-catch
		
		
//		try {
//			Class.forName(className); // 이 클래스가 있는지
//			System.out.println("입력하신 " + className + "클래스가 있습니다.");
//		} catch (ClassNotFoundException e) {
//			System.out.println("입력하신 " + className + "클래스가 없습니다.");
//			e.printStackTrace();
//		} 
		
		
		Class.forName(className); // 이렇게만 쓰면 컴파일 에러 그래서 throws 필요  
	}
}
