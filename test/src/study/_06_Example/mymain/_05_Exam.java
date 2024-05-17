package study._06_Example.mymain;

import java.util.ArrayList;
import java.util.List;

import study._06_Example.util.MyArrayList;

public class _05_Exam {

	public static void main(String[] args) {
		// Generic : JDK 5.0 later 
		
		// 1. 제네릭 사용 안하는 경우 
		// Collection은 자바의 모든 객체 저장 가능
		
		// 어떻게 가능한지? 모든 상위 클래스 Object로 받아서 저장
		//자동 형변환 :  Object로 Up-casting 
		
		List list = new ArrayList();
		list.add("안녕");
		list.add(20); 				   //  Wrapper 클래스 말고 기본형 원래 안들어가는데, 자동으로 Integer로 Boxing
		list.add(Integer.valueOf(20)); // Integer 형 자료 
		list.add(10.5);				   // Double
		list.add('A');                 // Character   
		list.add(true);                // Boolean
		list.add(10L);                 // Long
		list.add(1.0F);                // Float
		
		// 타입체크 + Down Casting 해야하는 번거로움
		if(list.get(0) instanceof String) {
			String msg = (String)list.get(0);
		}

		// 2. 제네릭 사용 하는 경우 
		// 저장 타입이 결정되는 시점은 : 객체 생성 시점 
		List<String> sido_list = new ArrayList<String>();
		
		sido_list.add("서울");
		sido_list.add("경기");
		sido_list.add("부산");
		
		System.out.println("요소 갯수 : " + sido_list.size());
		System.out.println(sido_list.get(0));
		
		////////////////////////////////////
		// 내가 만든 ArrayList사용 : 타입지정 X 
		MyArrayList myList = new MyArrayList();
		myList.add("Hello");
		myList.add(10);
		myList.add(1.0);
		
		System.out.println("요소 갯수 : " + myList.size());
		
		String str = (String) myList.get(0); // Object로 저장한 데이터를 String으로 가져오려고 해서 에러 
		System.out.println(str);
		
		// 내가 만든 ArrayList사용 : 타입지정 O 
		MyArrayList<Integer> lottoList = new MyArrayList<Integer>();
		lottoList.add(1);
		lottoList.add(45);
		
		//lottoList.add("하이"); // Integer아니라서 안들어감
		
		MyArrayList<String> fruitList = new MyArrayList<String>();    
		fruitList.add("사과");
		fruitList.add("복숭아");
		fruitList.add("샤인머스캣");
		
		for(int i = 0; i < fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
		
	}

}
