package study._04_javaIO.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.TreeMap;

import study._04_javaIO.vo.PersonVo;

public class _07_Serial_Person_Map {

	public static void main(String[] args) throws Exception {
		Map<String, PersonVo> personMap = new TreeMap<String, PersonVo>();
		// 키 값으로 정렬 
		
		personMap.put("길동1", new PersonVo("길동1", 20, "서울시 관악구 봉천1동"));
		personMap.put("길동2", new PersonVo("길동2", 21, "서울시 관악구 봉천2동"));
		personMap.put("길동3", new PersonVo("길동3", 22, "서울시 관악구 봉천3동"));
		personMap.put("길동4", new PersonVo("길동4", 23, "서울시 관악구 봉천4동"));
		personMap.put("길동5", new PersonVo("길동5", 24, "서울시 관악구 봉천5동"));

		//직렬화로 저장된 파일 : binary 파일 (이진파일) 
		OutputStream os = new FileOutputStream("person_map.dat");
		// 객체 저장할 수 있는 Filter 객체 생성 
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		// 저장. PersonVO 저장 
		oos.writeObject(personMap);
		
		// 닫기 
		oos.close(); // 열린역순으로 닫기 
		os.close();
	}

}

