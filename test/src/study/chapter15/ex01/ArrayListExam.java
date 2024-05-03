package study.chapter15.ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");					// list의 마지막에 객체 추가
		list.add("jsp");
		list.add("spring");
		list.add("Integer");
		list.add("for");
		list.add(2, "double");				// 인덱스를 지정해서 추가 
		
		int size = list.size();
		System.out.println("총 객체 개수 : " + size);
		
		for(int i = 0; i < size; i++) {
			System.out.println(list.get(i)); // 객체를 꺼낸다.  
		}
		
		int num = 3;
		String str1 = list.get(num);
		System.out.println(str1);
		
		list.set(num, "자바스크립트");
		System.out.println(list.get(3));
		
		String str3 = "Integer";
		boolean objCheck = list.contains(str3);
		System.out.println(str3 +"이 list에 존재하는지 여부 : " + objCheck);

		System.out.println("원본---");
		for(String s : list) {
			System.out.println(s);
		}

		
		list.remove(2);
		list.remove(2);
		System.out.println("지운뒤---");
		for(String s : list) {
			System.out.println(s);
		}
		
		
	}

}
