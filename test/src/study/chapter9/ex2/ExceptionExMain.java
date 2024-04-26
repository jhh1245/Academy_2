package study.chapter9.ex2;

public class ExceptionExMain {

	public static void main(String[] args) {
//		ExceptionEx.findClass("java.lang.String");
//		ExceptionEx.findClass("java.lang.System2");
//		ExceptionEx.findClass("java.lang.System");

		
		try {
			ExceptionEx.findClass("java.lang.String");
			System.out.println("존재하는 클래스");
		} catch(ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스");
			e.printStackTrace();
		}
	}

}
