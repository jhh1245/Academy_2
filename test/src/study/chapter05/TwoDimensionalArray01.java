package study.chapter05;

public class TwoDimensionalArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 1;
		arr[1][1] = 2;
		arr[1][2] = 3;
		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++)
				System.out.println(arr[i][j]);
		}
		
		System.out.println("arr.length : " + arr.length);
		System.out.println("arr[0].length : " + arr[0].length);
		
	
		System.out.print("향상된 for문 : ");
		for(int[] a : arr) {
			for(int b : a) {
				System.out.print(b);	
			}
		}
		

	}

}
