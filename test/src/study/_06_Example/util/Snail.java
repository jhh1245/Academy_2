package study._06_Example.util;

public class Snail {

	// 오른쪽으로 이동하다가 막히면 || 값이 채워져 있으면 -> 아래로 이동해라 
	// 아래로 이동하다가 막히면 || 값이 채워져 있으면 -> 왼쪽으로 이동 
	// 왼쪽으로 가다가 막히면 || 값이 채워져 있으면 -> 위로 가라 
	// 다시 오른쪽으로.. 
	
	int chasu;
	int [][] sn_array;
	
	public void setChasu(int chasu) {
		this.chasu = chasu;
		
		make_snail();
	}
	
	public void make_snail() {
		sn_array = new int[chasu][chasu];
		
		int row = 0, col = 0;
		int su = 1;
		char check = 'R'; 
		
		sn_array[row][col] = su++;
		
		for(int i = 0; i < chasu * chasu - 1; i++) {
			// 방향은 오른쪽이고, 우측으로 나갔을 경우나, 값이 채워져 있는 경우 
			if(check == 'R') {
				col++;
				if(col == chasu || sn_array[row][col] != 0) {
					check = 'D';
					col--;
					row++;
				}
			} else if(check == 'D') {
				row++;
				if(row == chasu || sn_array[row][col] != 0) {
					check = 'L';
					col--;
					row--;
				}
			} else if(check == 'L') {
				col--;
				if(col < 0 || sn_array[row][col] != 0) {
					check = 'T';
					col++;
					row--;
				}
			} else if(check == 'T') {
				row--;
				if(row < 0 || sn_array[row][col] != 0) {
					check = 'R';
					col++;
					row++;
				}
			}
			sn_array[row][col] = su++;
		}
		
		
	}
	
	public void show_snail() {
		for(int i = 0; i < chasu; i++) {
			for(int j = 0; j < chasu; j++) {
				System.out.printf("[%4d]", sn_array[i][j]);
			}
			System.out.println();
		}
	}
}
