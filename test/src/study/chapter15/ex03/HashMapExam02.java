package study.chapter15.ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam02 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("아이유", 70);
		map.put("유재석", 90);
		map.put("신동엽", 100);
		map.put("김종국", 60);
		
		int size = map.size();
		System.out.println("객체 수 : " + size);
		System.out.println("유재석을 키로 찾은 값 : " + map.get("유재석"));
		
		Set<String> keySet = map.keySet(); 
		// map 안에 있는 key만 모아서 Set타인인 keySet에 넣는다.
		// Set타입이기 때문에 iterator를 사용할 수 있다. 
		// 반복문을 쓰기 위해서 
		Iterator<String> iterator = keySet.iterator(); //Iterator 타입으로 바꿈. key가 들어있다. 
		while(iterator.hasNext()) {
			String key = iterator.next(); 
			int value = map.get(key); // key를 매개변수로 value를 꺼낸다.
			System.out.println("키 : " + key + ", 값 : " + value);
		}
	}

}
