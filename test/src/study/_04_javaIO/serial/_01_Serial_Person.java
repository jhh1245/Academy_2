package study._04_javaIO.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import study._04_javaIO.vo.PersonVo;

public class _01_Serial_Person {
	public static void main(String[] args) throws Exception {
		PersonVo p = new PersonVo("홍길동", 30, "서울시 관악구 남부순환로");
		
		//직렬화로 저장된 파일 : binary 파일 (이진파일) 
		OutputStream os = new FileOutputStream("person.dat");
		// 객체 저장할 수 있는 Filter 객체 생성 
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		// 저장. PersonVO 저장 
		oos.writeObject(p);
		
		// 닫기 
		oos.close(); // 열린역순으로 닫기 
		os.close();
		
	}
}
