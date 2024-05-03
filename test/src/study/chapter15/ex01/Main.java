package study.chapter15.ex01;

import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		List<Border> list = new Vector<>();
		list.add(new Border("글제목1", "내용1", "작성자1"));
		list.add(new Border("글제목2", "내용2", "작성자2"));
		
		for(Border b : list) { // 타입은 
			System.out.println(b.subject);
			System.out.println(b.content);
			System.out.println(b.writer);
		}
		
		for(int i = 0; i < list.size(); i++) {
			Border b = list.get(i);
			System.out.println(b.subject);
			System.out.println(b.content);
			System.out.println(b.writer);
		}
	}

}
