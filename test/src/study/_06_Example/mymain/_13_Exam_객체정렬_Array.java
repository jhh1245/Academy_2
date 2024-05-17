package study._06_Example.mymain;

import java.util.Arrays;

import study._06_Example.vo.PersonCompare;
import study._06_Example.vo.PersonVo;

public class _13_Exam_객체정렬_Array {

	public static void main(String[] args) {
		PersonVo[] p_array = {
				new PersonVo("길동1", 35, "서울 관악 남부순환로3"),
				new PersonVo("길동4", 34, "서울 관악 남부순환로4"),
				new PersonVo("길동3", 33, "서울 관악 남부순환로2"),
				new PersonVo("길동5", 32, "서울 관악 남부순환로5"),
				new PersonVo("길동2", 31, "서울 관악 남부순환로1")
		};

		System.out.println("---[before sort]---");
		for(PersonVo p : p_array) {
			System.out.println(p);
		}
		
		// 정렬기준정보를 전달해줘야한다
		PersonCompare comp = new PersonCompare();
		 
	
		
		System.out.println("---[after sort : 이름순 오름차순]---");
		Arrays.sort(p_array, comp); // 2번째 파라미터를 기준으로 p_array를 정렬한다.
		for(PersonVo p : p_array) {
			System.out.println(p);
		}
		
		comp.setSort_method(PersonCompare.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("---[after sort : 이름순 내림차순]---");
		for(PersonVo p : p_array) {
			System.out.println(p);
		}
		
		
		comp.setSort_field(PersonCompare.SORT_FIELD_AGE);
		comp.setSort_method(PersonCompare.SORT_METHOD_ASC);
		Arrays.sort(p_array, comp);
		System.out.println("---[after sort : 나이순 오름차순]---");
		for(PersonVo p : p_array) {
			System.out.println(p);
		}
		
		comp.setSort_method(PersonCompare.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("---[after sort : 나이순 내림차순]---");
		for(PersonVo p : p_array) {
			System.out.println(p);
		}
		
		comp.setSort_field(PersonCompare.SORT_FIELD_ADDR);
		comp.setSort_method(PersonCompare.SORT_METHOD_ASC);
		Arrays.sort(p_array, comp);
		System.out.println("---[after sort : 주소순 오름차순]---");
		for(PersonVo p : p_array) {
			System.out.println(p);
		}
		
		comp.setSort_method(PersonCompare.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("---[after sort : 주소순 내림차순]---");
		for(PersonVo p : p_array) {
			System.out.println(p);
		}
		
		
//		System.out.println("ABC".compareTo("ABC")); // 값이 같으면 0
//		System.out.println("ABC".compareTo("ABc"));
		// A - A : 65 - 65 
		// B - B : 66 - 66 
		// C - c : 67 - 99
		// 양수가 나왔다면 앞에 문자가 크다. 음수가 나왔다면 뒤 문자가 크다. 
		
	}

}
