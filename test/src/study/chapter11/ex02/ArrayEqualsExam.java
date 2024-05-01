package study.chapter11.ex02;

import java.util.Arrays;

public class ArrayEqualsExam {

	public static void main(String[] args) {
		int[][] intArray = {{1,2}, {3,4}}; 
		
		// 얕은 복제
		int[][] clone1 = Arrays.copyOf(intArray, intArray.length);
		System.out.println("얕은 복제 후 비교");
		System.out.println("번지 비교 : " + intArray.equals(clone1)); 
		// 번지가 같은가? intArray : 0x100, clone1 : 0x200 다르다.
		
		System.out.println("1차원 배열 비교 : " + Arrays.equals(intArray, clone1));
		// intArray 는 0x500, 0x600 clone1도 0x500, 0x600 이니까 true
		System.out.println("2차원 배열 비교 : " + Arrays.deepEquals(intArray, clone1));
		// intArray 는 1,2,3,4 clone1도 동일하니까 
		
		// 깊은 복제		
		int[][] clone2 = Arrays.copyOf(intArray, intArray.length);
		clone2[0] = Arrays.copyOf(intArray[0], intArray[0].length);
		clone2[1] = Arrays.copyOf(intArray[1], intArray[1].length);

		//intArray[0][1] = 33; 
		System.out.println(Arrays.toString(clone2[0]));
		
		System.out.println("깊은 복제 후 비교");
		System.out.println("번지 비교 : " + intArray.equals(clone2));
		System.out.println("1차원 배열 비교 : " + Arrays.equals(intArray, clone2));
		System.out.println("2차원 배열 비교 : " + Arrays.deepEquals(intArray, clone2));
	}

}
