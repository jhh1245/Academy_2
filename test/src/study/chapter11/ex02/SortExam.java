package study.chapter11.ex02;

import java.util.Arrays;

public class SortExam {

	public static void main(String[] args) {
		int[] scores = {98, 87, 94, 100, 83, 76, 79, 99, 88};
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		
		System.out.println(Arrays.toString(scores));
		
		String[] names= {"jessica", "kelly", "grace", "esther", "angella", "lisa"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		String[] kNames= {"유재석", "이광수","강호동"};
		System.out.println(Arrays.toString(kNames));
		Arrays.sort(kNames);
		System.out.println(Arrays.toString(kNames));
	}

}

