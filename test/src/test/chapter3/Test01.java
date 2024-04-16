package test.chapter3;

public class Test01 {

	public static void main(String[] args) {
		int a = +100;
		int b = -100;
		double c = 3.14;
		double d = -10.5;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d); //-d 는 -10.5
		
		byte e = -100;
		//byte result = +d; // 변수 앞 +와 -가 붙으면, int형이어야 한다. 그러니 기본적으로는 int를 써라 
		int result2 = +e;
		byte result3 = (byte)+e;
		System.out.println(result3);
		
		
	}

}
