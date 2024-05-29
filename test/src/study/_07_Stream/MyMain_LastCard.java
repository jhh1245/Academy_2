package study._07_Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class MyMain_LastCard {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 1. N개의 카드 숫자 입력받는다. 
		// 2. 1장의 카드가 남을 때까지 아래 내용 반복
		//   1) 첫번째 카드 버림 
		//   2) 두번째 카드 마지막으로 이동 
		// 3. 마지막 남은 카드 출력 
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		
		while(q.size() > 1) {
			q.poll();	// 맨 앞의 원소 버림 
			q.offer(q.poll());	// 맨 앞의 원소를 버림과 동시에 버려진 원소를 맨 뒤에 삽입 
		}
		
		System.out.println(q.poll());	// 마지막으로 남은 원소 출력 
		
	}

}

//package study._07_Stream;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class MyMain_LastCard {
//
//	public static void main(String[] args) {
//
//		// 1. N개의 카드 숫자 입력받는다. 
//		// 2. 1장의 카드가 남을 때까지 아래 내용 반복
//		//   1) 첫번째 카드 버림 
//		//   2) 두번째 카드 마지막으로 이동 
//		// 3. 마지막 남은 카드 출력 
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i = 1; i <= N; i++) {
//			list.add(i);
//		}
//		//System.out.println(list);
//		
//		while(list.size() > 1) {
//			list.remove(0);
//			list.add(list.get(0));
//			list.remove(0);
//			//System.out.println(list);
//			
//		}
//		
//		System.out.println(list.get(0));
//		
//	}
//
//}
