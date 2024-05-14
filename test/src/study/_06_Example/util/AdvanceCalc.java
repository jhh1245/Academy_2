package study._06_Example.util;

public class AdvanceCalc extends BaseCalc {
	
	// n까지의 총 합을 구한다. 
	public int hap(int n) {
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			// sum = sum + i;
			sum = super.plus(sum, i); // 부모 메소드 호출 = 상속했으니까 부모꺼를 불러다 쓸 수 있다!  
		}
		
		return sum;
	}
	
	// n의 m승을 구한다. 
	public int pow(int n, int m) {
		int result = 1;
		for(int i = 0; i < m; i++) {
			// result = result * n;
			result = super.multiply(result, n);
		}
		return result;
	}
}
