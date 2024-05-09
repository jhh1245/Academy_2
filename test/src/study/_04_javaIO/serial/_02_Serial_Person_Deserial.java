package study._04_javaIO.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import study._04_javaIO.vo.PersonVo;

public class _02_Serial_Person_Deserial {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("person.dat");
		// 역직렬화(재조립과정) 처리 객체 생성
		ObjectInputStream ois = new ObjectInputStream(is);
		
		PersonVo p = (PersonVo)ois.readObject();
		
		System.out.println(p);
		
		ois.close();
		is.close();
		
		

	}

}
