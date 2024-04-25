package study.chapter9.ex1;

public class ExceptionHandlerEx02 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("해당 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스가 없습니다. (예외발생)");
			e.printStackTrace();
		} // 예외처리를 해야만 사용할 수 있는 클래스
	}
}
