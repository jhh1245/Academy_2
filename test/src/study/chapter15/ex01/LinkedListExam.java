package study.chapter15.ex01;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<String>list1 = new ArrayList<String>();
		List<String>list2 = new ArrayList<String>();
		
		long startTime;
		long endTime;
		
		// ArrayList 시간 
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i)); 
			// i값을 String으로 바꾼다. 0번 인덱스에 0~100000까지 넣는 시간 측정 
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 시간 : " + (endTime - startTime));
		
		
		// LinkedList 시간 
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i)); 
			// i값을 String으로 바꾼다. 0번 인덱스에 0~100000까지 넣는 시간 측정 
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 시간 : " + (endTime - startTime));
		
	}

}
