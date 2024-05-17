package study._06_Example.mymain;

public class _02_Exam {

	public static void main(String[] args) {
		/* 형변환 (Type Conversion)
		 * 1. 자동형변환 (묵시적) 
		 *  1) 연산시 : 자료형이 큰 쪽으로 변환 (byte < short < int < long < float < double) 
		 *            float, double 실수형이다. 
		 *            float 4 바이트인데 int 보다 큰 이유는? 
		 *            long형 : 크기가 8바이트, 10의 20승까지 표현 가능
		 *            float형 : 크기가 4바이트, 10의 -38 ~ 10의 38승까지 표현가능    
		 *            정수, 실수가 표현하는 방식이 틀리기 때문에 float가 더 크다. 
		 *            
		 *  		  1 + 1.0 
		 *            (int) + (double) 연산이 안된다. 자료형이 같은 것만 계산 가능하도록 설계되어있다.
		 *               
		 *  2) 대입시 : 좌변항 측으로 변환 (단 좌변항 > 우변항) 
		 *  		  float f = 10; 원래대로라면 안들어간다. but 들어가는 이유는? 
		 *   		  float 형으로 들어간다.
		 *   
		 *            float f = 10f; float 상수 선언 방법
		 *            int n = 10.5; 불가능 하. 
		 *             
		 *             
		 * 2. 강제형변환 (명시적)
		 *            int n = (int)10.5; 
		 */			  
		
		
		// int 보다 작은 자료형끼리 연산한 결과는 int
		// byte + byte -> int
		// short + short -> int 
		
		// int + long -> long 
		// int + float -> float 
		
		byte b1 = 1;
		byte b2 = 2;
		// byte b3 = b1 + b2; // int 
		byte b3 = (byte) (b1 + b2); // byte + byte는 byte라고 생각할 수 있지만, b1 + b2가 int형이다. 
		System.out.println(b3);
		
		short s1 = 1;
		short s2 = 2;
		// short s3 = s1 + s2; 
		short s3 = (short) (s1 + s2); 
		

	}

}
