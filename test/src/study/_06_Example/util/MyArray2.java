package study._06_Example.util;

public class MyArray2 {
	public static void display(int [][]mm) {
		for(int i = 0; i < mm.length; i++) {
			for(int j = 0; j < mm[i].length; j++) {
				System.out.printf("[%4d]", mm[i][j]);
			}
			System.out.println();
		}
	}	
	public static void display_block(int [][]mm) {
		for(int i = 0; i < mm.length; i++) {
			for(int j = 0; j < mm[i].length; j++) {
				if(mm[i][j] == 1) {
					System.out.printf("■ ");
				} else {
					System.out.printf("□ ");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void display_t(int [][]mm) {
		for(int i = 0; i < mm.length; i++) {
			for(int j = 0; j < mm[i].length; j++) {
				System.out.printf("[%4d]", mm[i][j]);
			}
			System.out.println();
		}
	}	

	
	
}
