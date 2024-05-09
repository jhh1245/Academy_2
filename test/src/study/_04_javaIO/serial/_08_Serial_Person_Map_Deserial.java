package study._04_javaIO.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import study._04_javaIO.vo.PersonVo;

public class _08_Serial_Person_Map_Deserial { // 객체로 만든 배열 역직렬화 

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("person_map.dat");
		// 역직렬화(재조립과정) 처리 객체 생성
		ObjectInputStream ois = new ObjectInputStream(is);
		
		Map<String, PersonVo> person_map = (Map<String, PersonVo>)ois.readObject();
		
		
		// Map 출력 방법 1 : 키를 Set으로 만들어서 각각의 키로 value 값 가져오기
		System.out.println("키를 Set으로 만들어서 출력");
		Set<String> keySet = person_map.keySet();        
		for (String key : keySet) {            
			System.out.printf("%s : %s\n", key, person_map.get(key));        
		}
		
		
		System.out.println("람다식으로 출력");
		// Map 출력 방법 2 : forEach로 한번에 가져오기 		
		person_map.forEach((key, value) -> {
			System.out.printf("%s : %s\n", key, value);        
		});
		
		
		// Map 출력 방법 3 : iterator 사용 
//		Set<String> keySet = person_map.keySet(); 
//		// map 안에 있는 key만 모아서 Set타인인 keySet에 넣는다.
//		// Set타입이기 때문에 iterator를 사용할 수 있다. 
//		// 반복문을 쓰기 위해서 
//		
//		Iterator<String> iterator = keySet.iterator(); //Iterator 타입으로 바꿈. key가 들어있다. 
//		while(iterator.hasNext()) {
//			String key = iterator.next(); 
//			PersonVo value = person_map.get(key); // key를 매개변수로 value를 꺼낸다.
//			System.out.println("키 : " + key + ", 값 : " + value);
//		}
		
		ois.close();
		is.close();
		
		

	}

}
