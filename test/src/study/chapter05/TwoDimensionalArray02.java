package study.chapter05;

public class TwoDimensionalArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int [][] arr = new int[2][3];
		// 이 문장을 
		
		// int [][] arr = new int[2][5];
		// 로 변경할 경우 아래 for문으로는 3번째까지 밖에 출력이 안된다. 
		
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 3; j++)
//				System.out.print(arr[i][j] + " ");
//		}
//		System.out.println();
		
		
		
		// 아래와 같이 하면 행이나 열이 추가되어도 for문을 수정하지 않아도 된다. 
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9,10}};
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}	
		
	}

}
