package study._06_Example.mymain;

import study._06_Example.util.MyArray2;

public class _07_Exam_배열 {

	// 배열 : 동일한 자료형이 연속 할당되는 자료구조
	public static void main(String[] args) {
		// 고정 길이 배열 
		//                   행 열
		int [][] m = new int[3][4];
		
		MyArray2.display(m);
		
		// 가변 길이 배열 : 행마다 열의 개수가 틀린 배열
		
		int [][] mm2 = new int[3][];
		
		mm2[0] = new int[2];
		mm2[1] = new int[3];
		mm2[2] = new int[4];
		
		System.out.println();
		
		MyArray2.display(mm2);
		
		// 2차원 배열 초개ㅣ화 
		int [][] mm3 = new int [][] {
			{1,2},			// 0
			{3,4,5},		// 1
			{6,7,8,9} 		// 2
		};
		
		MyArray2.display(mm3);
		
		int [][] block_box = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
		};
		
		int [][] block_l = {
				{1,0,0},
				{1,0,0},
				{1,1,1}
		};
		
		int [][] block_t = {
				{1,1,1},
				{0,1,0},
				{0,1,0}
		};

		MyArray2.display_block(block_box);
		MyArray2.display_block(block_l);
		MyArray2.display_block(block_t);
	}

}
