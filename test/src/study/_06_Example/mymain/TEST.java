package study._06_Example.mymain;

import study._06_Example.util.MyArrays;

public class TEST {
	public static void main(String[] args) {
		int [] arr = {5, 7, 3, 6};
		
		
		System.out.println("---[삽입정렬 내림차순]---");
		int k; 
		int key;
		for(int i = 1; i < arr.length; i++) {
			key = arr[i];
			
			// key값이 들어갈 자리를 찾는다. 
			for(k = i-1; k >= 0; k--) {
				if (key > arr[k]) {
					arr[k+1] = arr[k] ;
				} else { // 지금 k는 key보다 크다.  
					break;
				}
			} // end : for k
			System.out.println(k);
			for(int ii : arr) {
				System.out.printf("%3d", ii);
			}
			System.out.println();
			arr[k+1] = key; // 그래서 k + 1번 인덱스에 key를 넣는다. 왜냐하면 key보다 큰 값을 한칸씩 뒤로 미뤘으니까 
		} // end : for i
		for(int i : arr) {
			System.out.printf("%3d", i);
		}
		System.out.println();
	}
}
