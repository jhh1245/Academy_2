package study._06_Example.mymain;

import java.util.Arrays;
import java.util.Comparator;

import study._06_Example.util.MyArrays;

public class _12_Exam_정렬기초 {

	public static void main(String[] args) {
		// Ascending  : 오름차순 (소 -> 대)
		// Descending : 내림차순 (대 -> 소)
		
		int [] arr = {5, 7, 3, 6, 1, 2, 8, 4, 9};
		Arrays.sort(arr);
		System.out.println("---[오름차순]---");
		for(int su : arr) {
			System.out.printf("%3d", su );
		}
		System.out.println();
		
		Integer [] arr2 = {5, 7, 3, 6, 1, 2, 8, 4, 9};
		Arrays.sort(arr2, Comparator.reverseOrder()); // 객체로 넣어줘야됨 
		System.out.println("---[내림차순]---");
		for(int su : arr2) {
			System.out.printf("%3d", su );
		}
		System.out.println();
		
		
		System.out.println("---[선택정렬 오름차순]---");
		MyArrays.selectionSortAsc(arr);
		for(int i : arr) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		System.out.println("---[선택정렬 내림차순]---");
		MyArrays.selectionSortDesc(arr);
		for(int i : arr) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		System.out.println("---[삽입정렬 오름차순]---");
		MyArrays.insertionSortAsc(arr);
		for(int i : arr) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		System.out.println("---[삽입정렬 내림차순]---");
		MyArrays.insertionSortDesc(arr);
		for(int i : arr) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		System.out.println("---[버블정렬 오름차순]---");
		MyArrays.bubbleSortAsc(arr);
		for(int i : arr) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		System.out.println("---[버블정렬 내림차순]---");
		MyArrays.bubbleSortDesc(arr);
		for(int i : arr) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
	}

}
