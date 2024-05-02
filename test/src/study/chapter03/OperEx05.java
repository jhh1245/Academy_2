package study.chapter3;

public class OperEx05 {

	public static void main(String[] args) {
		int a = 14;
		boolean result = a > 10;
		System.out.println(result);
		
		boolean re = a > 10 && a < 20;
		System.out.println(re);
		
		int b = 10;
		boolean re2 = b > 0 && b > 5 && b > 10;
		System.out.println(re2);
		
		int c = 10;
		boolean re4 = c > 0 ^ c > 5; 
		System.out.println(re4); //1개만 true일 때 true인데 여기선 둘다 ture니까 false 

	}

}
