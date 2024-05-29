package study._07_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyMain_TestSteam {

	public static void main(String[] args) {
		// 1~4. 과정을 거친다. 
		// 배열 -> set -> 배열 -> 정렬 -> list
		
		int [] arr = {1, 5, 8, 15, 5, 10, 20, 10, 9, 25};
		
		// 1. 중복 값을 제거 
		Set<Integer> set1 = new HashSet<Integer>();
		
		for(int n : arr) {
			set1.add(n);
		}
		System.out.println(set1);
		
		// 2. Set -> Array
		Integer[] arr1 = new Integer[set1.size()];
		set1.toArray(arr1);
		
		
		// 3. 정렬
		Arrays.sort(arr1);
		
		
		for(int n : arr1) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 4. Array -> Array List : 5의 배수만  
		List<Integer> list = new ArrayList<Integer>();
		for(int n : arr1) {
			if(n % 5 == 0) {
				list.add(n);
			}
		}
		
		System.out.println(list);
		
		
		
		// ------------- stream 이용 ------------------ 
		
		System.out.println("스트림이용");
		// boxing -> 중복제거 -> 정렬 -> 필터링 -> 리스트로 변환
		IntStream intStream = Arrays.stream(arr);
		 
		
		// 스트림은 일회용이다! 
		IntStream intStream1 = Arrays.stream(arr);
		// count() sum() min() max() average() 기능이 있다. 
		
		// System.out.println(intStream1.count());
		// System.out.println(intStream1.sum());        // 일회용이라 한번 사용한거 또 사용하려면 에러난다.
		System.out.println(intStream1.max().orElse(0)); // max가 Null이면 0으로 치환한다. 
		
		IntStream intStream2 = Arrays.stream(arr);
		
		List<Integer> listFromStream = 
			intStream.boxed()       // int -> Stream<Integer> 
					 .distinct()    // 중복제거 
					 .sorted()    	// 정렬 : Comparator.reverseOrder() 내림차순
					 .filter(n -> n%5 == 0) // 5의 배수만 
					 .collect(Collectors.toList()); // 결과물, 생성 : List 
		  
		System.out.println(listFromStream);
		
		String result = 
				intStream2.boxed()
						  .distinct() 
						  .sorted()
						  .filter(n -> n%5 == 0)
						  .map(n -> n+" ")            // 새로운데이터를 만든다. 문자열로 "5 ", "10 ", ... 
						  .reduce("", (a,b) -> b+a);
							// "5" + "" 
							// "10 " + "5"
		  					// "15 " + "10 5"
		System.out.println(result); // 정렬이 거꾸로 되었다. 
		
		
		IntStream intStream4 = IntStream.range(1, 11); // 1~10까지 수
		
		
		int total_result =
				intStream4.reduce(0, (total, n) -> total+n); // total 초기값 0, total = total + n
		                         //   0 + 1 + 2 + ...
		
		System.out.println(total_result);                         
		
	}

}
