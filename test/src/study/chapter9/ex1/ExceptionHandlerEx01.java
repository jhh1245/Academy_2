package study.chapter9.ex1;

public class ExceptionHandlerEx01 {
	public static void main(String[] args) {
		
		try { // 예외가 발생할 수 있는 부분
			String[] strArray = {"100", "200", "300"};
			
			for(int i = 0; i <= strArray.length; i++) {
				System.out.println(strArray[i]);
				int intValue = Integer.parseInt(strArray[i]);
				System.out.println(intValue);
			}
			System.out.println("정상실행");
//		} catch(ArrayIndexOutOfBoundsException ae) {
//			ae.printStackTrace();
//		} catch(NumberFormatException ne) {
//			ne.printStackTrace();
//		} 
			
		}
			catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
				System.out.println("ArrayIndexOutOfBoundsException 또는 NumberFormatException 예외발생");
				e.printStackTrace();
			}
		
		catch(Exception e ) {
		
			e.printStackTrace();
		} 
		System.out.println("프로그램 종료");
		
	}
}
