package study._06_Example.util;

public class MyArrays {
	// 선택정렬 - 오름차순
	public static void selectionSortAsc(int [] arr) {
		for(int i = 0; i < arr.length-1; i++) {        // i = selection
			for(int k = i+1; k < arr.length; k++) {  // k = move
				if(arr[i] > arr[k]) { 
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			} // end : for k
		} // end : for i
	}
	
	// 선택정렬 - 내림차순 
	public static void selectionSortDesc(int [] arr) { 
		for(int i = 0; i < arr.length-1; i++) {        // i = selection
			for(int k = i+1; k < arr.length; k++) {  // k = move
				if(arr[i] < arr[k]) { 
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			} // end : for k
		} // end : for i
	}
	
	// 삽입 정렬 - 오름차순 
	public static void insertionSortAsc(int [] arr) {
		int k; 
		int key;
		for(int i = 1; i < arr.length; i++) {
			key = arr[i];
			
			// key값이 들어갈 자리를 찾는다. 
			for(k = i-1; k >= 0; k--) {
				if (key < arr[k]) {
					arr[k+1] = arr[k] ;
				} else { // 지금 k는 key보다 작다.  
					break;
				}
			} // end : for k
			
			arr[k+1] = key; // 그래서 k + 1번 인덱스에 key를 넣는다. 왜냐하면 key보다 큰 값을 한칸씩 뒤로 미뤘으니까 
		} // end : for i
		
	}
	
	// 삽입 정렬 - 내림차순 @@ 이해안됨 @@ 
	public static void insertionSortDesc(int [] arr) {
		int k; 
		int key;
		for(int i = 1; i < arr.length; i++) {
			key = arr[i];
			
			// key값이 들어갈 자리를 찾는다. 
			for(k = i-1; k >= 0; k--) {
				if (key > arr[k]) {
					arr[k+1] = arr[k] ;
				} else { // 지금 k는 key보다 작다.  
					break;
				}
			} // end : for k
			
			arr[k+1] = key; // 그래서 k + 1번 인덱스에 key를 넣는다. 왜냐하면 key보다 큰 값을 한칸씩 뒤로 미뤘으니까 
		} // end : for i
		
	}
	
	// 버블 정렬 - 오름 차순 
	public static void bubbleSortAsc(int [] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int k = 0; k < arr.length-i; k++) {
				if(arr[k] > arr[k+1]) {
					int imsi = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = imsi;
				}
			}
		}
	}
	
	// 버블 정렬 - 내림 차순 
		public static void bubbleSortDesc(int [] arr) {
			for(int i = 1; i < arr.length; i++) {
				for(int k = 0; k < arr.length-i; k++) {
					if(arr[k] < arr[k+1]) {
						int imsi = arr[k];
						arr[k] = arr[k+1];
						arr[k+1] = imsi;
					}
				}
			}
		}
	
	
}
