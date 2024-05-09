package study._04_javaIO.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import study._04_javaIO.vo.PersonVo;

public class _03_Serial_Person_Array {

	public static void main(String[] args) throws IOException {
		PersonVo[] p_array = {new PersonVo("길동1", 30, "서울 관악 남부순환1"),
				new PersonVo("길동2", 31, "서울 관악 남부순환2"),
				new PersonVo("길동3", 32, "서울 관악 남부순환3"), 
				new PersonVo("길동4", 33, "서울 관악 남부순환4"),
				new PersonVo("길동5", 34, "서울 관악 남부순환5")};
		
		//직렬화로 저장된 파일 : binary 파일 (이진파일) 
		OutputStream os = new FileOutputStream("person_array.dat");
		// 객체 저장할 수 있는 Filter 객체 생성 
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		// 저장. PersonVO 저장 
		oos.writeObject(p_array);
		
		// 닫기 
		oos.close(); // 열린역순으로 닫기 
		os.close();

	}

}
