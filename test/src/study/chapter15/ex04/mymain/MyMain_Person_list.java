package study.chapter15.ex04.mymain;

import java.util.ArrayList;
import java.util.List;

import study.chapter15.ex04.vo.PersonVo;

public class MyMain_Person_list {

	// MyMain_Person_list의 인스턴스 메소드 = 
	// MyMain_Person_list를 new 해서 만들었을 때만 사용가능
	
	static void useIndexDisplay(List<PersonVo> p_list2 ) {
		System.out.println("---format 사용---");
		for(int i = 0; i < p_list2.size(); i++) {
			PersonVo p = p_list2.get(i);
			String name = p.getName();
			// System.out.println(name + ":" + p);
			// + 연산할 때 마다 메모리 낭비가 된다.
			
			System.out.printf("- %s : %s\n", name, p);
		} // end - for 
	} // end - useIndexDisplay
	
	static void loop(List<PersonVo> pList3) {
		System.out.println("---향상된 for문--");
		for(PersonVo p : pList3) {
			System.out.println(p);
		}
	}
	static void test() {
		StringBuffer sb = new StringBuffer();
		sb.append("a");
		sb.append("b");
		sb.append("c");
		sb.append("d");
		
		String str2 = sb.toString();
		
		String str3 = String.format("%s%s%s%s", "a", "b", "c", "d");
		System.out.println(sb);
		System.out.println(str2);
		System.out.println(str3);
		
		// 한번에 출력하기 
		String name = "홍길동이";
		int age = 20;
		double length = 180.5;
		double weight= 70.5;
		boolean bMarried = false;
		
		
		String str4 = String.format("%s\t %d\t %.1f\t %.2f\t %b", name, age, length, weight, bMarried);
		// %.1f : 소수점 1자리까지 
		System.out.println(str4);
	}
	
	public static void main(String[] args) {
		test();
		
		PersonVo p = new PersonVo();
		
		// p.name = "강감찬"; 
		
		p.setName("홍길동");
		p.setAge(20);
		p.setAddr("서울시 관악구 봉천1동");
		
		PersonVo p2 = new PersonVo("이길동", 30, "서울시 관악구 봉천2동");
		
		System.out.println(p);
		System.out.println(p2);
		
		List<PersonVo> pList = new ArrayList<PersonVo>();
		pList.add(new PersonVo("길동1", 31, "서울시 관악구 남부순환로1"));
		pList.add(new PersonVo("길동2", 32, "서울시 관악구 남부순환로2"));
		pList.add(new PersonVo("길동3", 33, "서울시 관악구 남부순환로3"));
		pList.add(new PersonVo("길동4", 34, "서울시 관악구 남부순환로4"));
		pList.add(new PersonVo("길동5", 35, "서울시 관악구 남부순환로5"));
		
	
		useIndexDisplay(pList); // static이니까 클래스 만들면 바로 
		// p_list2는 메소드 종료시 소멸된다.  
		// 잠깐 Stack에 만들어졌다가 지워진다. 
		
		loop(pList);
	}

}
