package study._03_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMain_Lamda_Collection {

	public static void main(String[] args) {
		// Collection 내의 람다식 
		// 컬렉션.forEach (람다식); 
		// 컬렉션만 람다식으로 가능하다. 
		
		// 1. 컬렉션 
		List<String> fruit_list = new ArrayList<String>();
		fruit_list.add("사과");
		fruit_list.add("딸기");
		fruit_list.add("참외");
		fruit_list.add("수박");
		fruit_list.add("포도");
		
		System.out.println("------[ 개선 loop List ]-----");
		for(String fruit : fruit_list) {
			System.out.println(fruit);
		}
		
		System.out.println("------[ Lambda식 List ]-----");
		fruit_list.forEach(fruit -> System.out.println(fruit)); 
		
		
		// 2. 배열 
		String[] sido_array = {"서울", "경기", "인천", "대전"};
		
		System.out.println("------[ 개선 loop List ]-----");
		for(String s : sido_array) {
			System.out.println(s);
		}
		
		System.out.println("------[ Lambda식 Array ]-----");
		Arrays.stream(sido_array).forEach(string -> System.out.println(string));
		// 배열은 람다식 forEach를 쓸 수 없어서 Arrays.stream으로 배열 객체를 만든다! 
		
		
		
		// 3. Map
		Map<String, String> wordMap = new HashMap<String, String>(); // key, value 한 쌍 
		wordMap.put("one", "하나");
		wordMap.put("two", "둘");
		wordMap.put("three", "셋");
		wordMap.put("four", "넷");
		wordMap.put("five", "다섯");
		
		System.out.println("------[ Lambda식 Map ]-----");
		wordMap.forEach((key, value) -> System.out.printf("영어로 [%s]는 한글로 [%s]입니다.\n", key, value));
		
		
		
	}

}
