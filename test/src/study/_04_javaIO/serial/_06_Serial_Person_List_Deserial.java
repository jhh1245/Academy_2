package study._04_javaIO.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

import study._04_javaIO.vo.PersonVo;

public class _06_Serial_Person_List_Deserial { // 객체로 만든 배열 역직렬화 

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("person_list.dat");
		// 역직렬화(재조립과정) 처리 객체 생성
		ObjectInputStream ois = new ObjectInputStream(is);
		
		List<PersonVo> p_list = (List<PersonVo>)ois.readObject();
		
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
		
		
		ois.close();
		is.close();
		
		

	}

}
