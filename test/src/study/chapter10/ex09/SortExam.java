package study.chapter10.ex09;

import java.util.Arrays;

public class SortExam {

	public static void main(String[] args) {
		int[] scores = {98, 87, 94, 100, 83, 76, 79, 99, 88};
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		
		System.out.println(Arrays.toString(scores));
		
		String[] names= {"jessica", "kelly", "grace", "esther", "angella", "lisa"};
		System.out.println(Arrays.toString(names));	
	}

}
