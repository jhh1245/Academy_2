package study._06_Example.mymain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import study._06_Example.vo.PersonCompare;
import study._06_Example.vo.PersonVo;

public class _14_Exam_객체정렬_ArrayList {

	public static void main(String[] args) {
		List<PersonVo> p_list = new ArrayList<PersonVo>();
		
		p_list.add(new PersonVo("가길동", 24, "신림1동"));
		p_list.add(new PersonVo("다길동", 23, "신림2동"));
		p_list.add(new PersonVo("나길동", 22, "신림4동"));
		p_list.add(new PersonVo("라길동", 21, "신림3동"));
		
		System.out.println("----before sort----");
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
		
		System.out.println("---이름순 오름차순---");
		PersonCompare comp = new PersonCompare();
		Collections.sort(p_list, comp); // p_list를 정렬할건데, PersonCompare클래스에서 정의한 방법대로 
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
	}
}
