package study.chapter5;

public class TwoDimensionalArray03 {

	public static void main(String[] args) {
		int [][] arr = new int[2][4];
		
		
		int cnt = 1;
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = cnt++;
			}
		}
				
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}	
		
	}

}
