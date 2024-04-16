package test.chapter3;

public class OperEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		byte byteVal1 = 1;
//		byte byteVal2 = 1;
//		//byte byteVal3= byteVal1 + byteVal2; // 컴파일 에러 1은 int인데 int 를 byte로 넣으려하니까 
//		int byteVal3= byteVal1 + byteVal2;
//		
//		System.out.println(byteVal3);
//		
//		int int1 = 10;
//		int int2 = 4;
//		int re1 = int1 / int2; //2.5
//		
//		System.out.println(re1); // 2
//		
//		double re2 = int1 / int2; // int / int 연산 결과도 int이기 때문에 -> 10 / 4 = 2 -> 2.0이 되었다. 
//		System.out.println(re2); //2.0
//		
//		double re3 = (int1 * 1.0) / int2; // 10.0 / 4 -> 실수/실수니까 결과도 실수 -> 2.5 
//		System.out.println(re3);
//		
//		double re4 = (double)int1 / int2; // 10.0 / 4 -> 실수/실수니까 결과도 실수 -> 2.5 
//		System.out.println(re4);
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		char ch2 = 'A' + 1;
		System.out.println(ch2);
		
		int k = 90;
		int e = 78;
		int m = 85;
		System.out.println(k+e+m);
		System.out.println((double)(k+e+m)/3);

	}

}
