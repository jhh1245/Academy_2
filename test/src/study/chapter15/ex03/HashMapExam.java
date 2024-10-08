package study.chapter15.ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("아이유", 70);
		map.put("유재석", 90);
		map.put("신동엽", 100);
		map.put("김종국", 60);
		
		int size = map.size();
		System.out.println("객체 수 : " + size);
		System.out.println("유재석을 키로 찾은 값 : " + map.get("유재석"));
		
		// 키, 값
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); 		
		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator(); 
		//Iterator 타입으로 바꿈. key와 value가 들어있다.
		
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next(); // 키와 밸류를 넣는다. 
			String key = entry.getKey(); // key를 매개변수로 value를 꺼낸다.
			int value = entry.getValue();
			
			
			System.out.println("키 : " + key + ", 값 : " + value);
		}
	}

}
