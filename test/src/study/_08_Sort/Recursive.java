package study._08_Sort;

public class Recursive {

	static int hap(int n) {
		if(n == 0) return 1;
		
		return n + hap(n-1);
	}
	public static void main(String[] args) {
		// 함수 재귀호출 
		int n = 10;
		int sum = 0;
		
		sum = hap(n);
		
		System.out.printf("%d까지 합 : %d\n", n, sum);
		
		
	}

}






