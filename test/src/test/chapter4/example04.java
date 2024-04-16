package test.chapter4;

public class example04 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0; 
		int c;
		//System.out.println(a);
		//System.out.println(b); //초기화를 하지 않으면 컴파일 에러 발생
		
		if(a > 0) {
			b = 100;
			System.out.println(a + b);
		} else {
			c = 200;
			System.out.println(a + c);
		} 
		
		System.out.println(a);
		System.out.println(b); // 컴파일 에러 발생 
	}

}
