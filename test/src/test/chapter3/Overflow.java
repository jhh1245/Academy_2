package test.chapter3;

public class Overflow {

	public static void main(String[] args) {
		//overflow : 값 표현범위를 초과하는 데이터 		
		//byte 범위 -128 ~ +127
		
		byte a = (byte)(100 + 28); //오버플로우된다. 
		//130인데 제일 첫번째 숫자로 넘어가서 -128이 된다. 
		System.out.println(a);

		
		int b = 1000000;
		int c = 1000000;
		int result = b * c;
		System.out.println(result);
		
		
		int ab = 10;
		System.out.println(ab / 0);
		
	}

}
