package study._06_Example.mymain;

import java.util.Arrays;

import study._06_Example.util.MyArrays;

public class _16_Exam_정렬_Overload {
	public static void main(String[] args) {
		// 정렬 아무거나 해서 오버로드 하기 
		int [] arr = {5, 7, 4, 9, 2};
		
		
		
//		System.out.println("---[sorted]---");
//		MyArrays.insertionSortDesc(arr);
//		for(int n : arr) {
//			System.out.printf("%3d", n);
//		}
//		System.out.println();
		

		
//		선택정렬 오름차순 ! 오버로딩 메소드 활용 (시작, 끝 지정) 
//		System.out.println("\n---[선택정렬 오름차순 ! 오버로딩 메소드 활용 (시작, 끝 지정)]---");
//		MyArrays.selectionSortAsc(arr, 1, 4);
//		for(int n : arr) {
//			System.out.printf("%3d", n);
//		}
//		System.out.println();
		
		
//		선택정렬 내림차순 ! 오버로딩 메소드 활용 (시작, 끝 지정) 
//		System.out.println("---[selection sorted(시작값, 끝값)]---");
//		MyArrays.selectionSortDesc(arr, 1, 6);
//		for(int n : arr) {
//			System.out.printf("%3d", n);
//		}
//		System.out.println();
//		
//		System.out.println("\n---원본---");
//		for(int n : arr) {
//			System.out.printf("%3d", n);
//		}
		
//		삽입정렬 오름차순! 오버로딩 메소드 활용 (시작, 끝 지정)		
//		System.out.println("\n---[삽입정렬 오름차순! 오버로딩 메소드 활용(시작값, 끝값)]---");
//		MyArrays.insertionSortAsc(arr, 1, 4);
//		for(int n : arr) {
//			System.out.printf("%3d", n);
//		}
//		System.out.println();
		
//		System.out.println("---원본---");
//		for(int n : arr) {
//			System.out.printf("%3d", n);
//		}
//		
//		삽입정렬 내림차순! 오버로딩 메소드 활용 (시작, 끝 지정)		
//		System.out.println("\n---[삽입정렬 내림차순! 오버로딩 메소드 활용(시작값, 끝값)]---");
//		MyArrays.insertionSortDesc(arr, 1, 4);
//		for(int n : arr) {
//			System.out.printf("%3d", n);
//		}
//		System.out.println();
		
		System.out.println("---원본---");
		for(int n : arr) {
			System.out.printf("%3d", n);
		}
		
		
//		버블정렬 오름차순! 오버로딩 메소드 활용 (시작, 끝 지정)	
		System.out.println("\n---[버블정렬 오름차순! 오버로딩 메소드 활용(시작값, 끝값)]---");
		MyArrays.bubbleSortAsc(arr, 2, 5);
		for(int n : arr) {
			System.out.printf("%3d", n);
		}
		System.out.println();
	
	
//		버블정렬 내림차순! 오버로딩 메소드 활용 (시작, 끝 지정)	
		System.out.println("\n---[버블정렬 내림차순! 오버로딩 메소드 활용(시작값, 끝값)]---");
		MyArrays.bubbleSortDesc(arr, 1, 4);
		for(int n : arr) {
			System.out.printf("%3d", n);
		}
		System.out.println();
	}
}
