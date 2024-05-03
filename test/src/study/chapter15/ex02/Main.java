package study.chapter15.ex02;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Member> memSet = new HashSet<Member>();
		
		memSet.add(new Member("홍길동", 30));
		memSet.add(new Member("김자바", 40));
		memSet.add(new Member("김자바", 40));
		
		int size = memSet.size();
		System.out.println(size);
	}

}
