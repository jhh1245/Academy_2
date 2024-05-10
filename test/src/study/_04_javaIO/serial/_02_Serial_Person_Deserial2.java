package study._04_javaIO.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import study._04_javaIO.vo.PersonVo2;

public class _02_Serial_Person_Deserial2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("person2.dat");
		// 역직렬화(재조립과정) 처리 객체 생성
		ObjectInputStream ois = new ObjectInputStream(is);
		
		PersonVo2 p = (PersonVo2)ois.readObject();
		
		System.out.println(p);
		
		ois.close();
		is.close();
		
		

	}

}
