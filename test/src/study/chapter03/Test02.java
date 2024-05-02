package study.chapter03;

public class Test02 {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		
//		++a; // 다른 연산자 없이 증감연산자만 사용되는 경우 선증가, 후증가 차이 없다. 
//		b++; 
//		System.out.println(a);
//		System.out.println(b);
		
		int r1 = ++a;
		int r2 = b++;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(a);
		System.out.println(b);

	}

}
