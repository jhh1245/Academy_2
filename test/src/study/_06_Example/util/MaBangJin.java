package study._06_Example.util;

public class MaBangJin {
	int chasu; 
	int [][] ma_array;
	
	public void setChasu(int chasu) {
		this.chasu = chasu;
		
		make_mabangjin();
	}

	public void make_mabangjin() {
		ma_array = new int[chasu][chasu]; // 마방진 채울 배열 생성
		int row = 0, col = chasu/2; // 시작 위치 
		int su = 1;
		
		// 1. 첫번째 칸 값 채우기
		ma_array[row][col] = su++; 
		
		// 2. 숫자 채우는 식 
		for(int i = 0; i < chasu * chasu - 1; i++) {
			// 1. 대각선 이동 
			row--; //위로
			col++; //오른쪽
			
			// 2. 위로도 나가고, 우측으로도 나갔는지?
			if(row < 0 && col == chasu) {
				row = row + 2; // 아래로 2칸
				col--; 	       // 앞으로 1칸 
			}
			
			// 3. 위로 나갔는지? 
			else if(row < 0) {
				row = chasu - 1; // 맨 아래로 이동 
			}
			
			// 4. 좌측으로 나갔는지? 
			else if(col == chasu) {
				col = 0;
			}
			
			// 5. 이미 값이 채워져있는지?
			if(ma_array[row][col] != 0) { // 초기값 0이 아니다 = 값 채워졌다.
				row = row + 2; // 아래로 2칸
				col--;		   // 앞으로 1칸 
			}
			
			// 값 넣기 
			ma_array[row][col] = su++;
			
		} // end : for 
	} // end:make_mabangjin()

	public void show_mabangjin() {
		for(int i = 0; i < chasu; i++) {
			for(int j = 0; j < chasu; j++) {
				System.out.printf("[%4d]", ma_array[i][j]);
			}
			System.out.println();
		}
	}
}
