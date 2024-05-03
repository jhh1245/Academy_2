package study.chapter15.ex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // 인덱스 번호가 없음으로 반복문 못 돌린다.
		
		set.add("java");	
		set.add("jsp");
		set.add("spring");
		set.add("Integer");
		set.add("for");
		set.add("java");		// 중복이라 들어가지 않는다. (오류는 안남)
		
		System.out.println(set.size());
		
		Iterator <String> iterator = set.iterator();
		while(iterator.hasNext()) { 
			String str = iterator.next();
			System.out.println(str); // 위에서 입력한 순서랑 다르게 나온다. = 순서가 없다. 
		}

		set.remove("jsp");
		System.out.println(set.size());
		
		for(String str : set) {
			System.out.println(str);
		}
		
		set.clear();		// 전체객체 지움  				
		
	}

}
