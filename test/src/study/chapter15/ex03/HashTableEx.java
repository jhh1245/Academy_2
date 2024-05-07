package study.chapter15.ex03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("string","111");
		map.put("thread", "1234");
		map.put("qwer", "2222");
		map.put("winter", "3333");
		
		
		while(true) {
			System.out.println("아이디 입력 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			String pw = sc.nextLine();	
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println(id + "님 로그인되었습니다.");
					break;
				} else {
					System.out.println("비밀번호를 잘못 입력했습니다.");
				}
			} else {
				System.out.println("Id를 잘못 입력했습니다.");
			}
			
		}
		

		//매개변수로 넣은 키가 있으면 true
//		boolean idCh = map.containsKey(id);
//		System.out.println(idCh);
//		//매개변수로 넣은 값이 있으면 true
//		boolean pwCh = map.containsValue(pw);
//		System.out.println(pwCh);
		
	}

}
