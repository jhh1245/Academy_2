package study.chapter10.ex03;

import java.util.HashMap;

public class KeyMain {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String> (); 
		// Key 타입으로 hashmap의 key를 받는다. 
		
		hashMap.put(new Key(1), "abcd"); 
		// haspmap 만들때 값은 string 쓰기로 했으니까
		
		String result = hashMap.get(new Key(1)); 
		// 새 Key 객체를 만들었으니 해시 코드가 다르다(메모리주소)
		
		// 해시코드 메서드를 재정의했다. 객체의 메모리주소 비교가 아니라Key의 number 필드로 비교
		
		// number 필드가 같으니까 equals를 호출했다.
		
		System.out.println(result);
		// 해시 코드가 다르니까 찾지 못하니까 null 
		
	}
}
