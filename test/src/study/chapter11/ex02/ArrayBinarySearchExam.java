package study.chapter11.ex02;

import java.util.Arrays;

public class ArrayBinarySearchExam {

	public static void main(String[] args) {
		// binarySearch() 배열항목에서 특정 값에 대한 인덱스 번호를 얻는 것을 배열 검색이라고 함 
		// 배열 검색을 하려면 Arrays.sort()로 정렬 후 사용 가능 하다.
		// 검색 결과 일치하는 값이 있는 경우 해당 인덱스 번호를 리턴, 원하는 값 없는 경우 -1 리턴 
		
		int[] scores = {98, 87, 94, 100, 83, 76, 79, 99, 88};
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		int scoresIndex = Arrays.binarySearch(scores, 88); // 인텍스 4에 위치함
		System.out.println(scoresIndex);
		
		String[] names= {"jessica", "kelly", "grace", "esther", "angella", "lisa"};
		Arrays.sort(names);
		int index2 = Arrays.binarySearch(names, "grace");
		System.out.println(Arrays.toString(names));
		System.out.println(index2);
		
		
		String[] kNames= {"유재석", "이광수","강호동"};
		System.out.println(Arrays.toString(kNames));
		Arrays.sort(kNames);
		
		int index3 = Arrays.binarySearch(kNames, "이광수");
		System.out.println(Arrays.toString(kNames));
		System.out.println(index3);
		
	}

}
