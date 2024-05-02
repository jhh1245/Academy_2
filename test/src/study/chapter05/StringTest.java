package study.chapter05;

public class StringTest {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		
//		System.out.println(a == b);
//		System.out.println(a != b);
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String ("홍길동"); //힙 영역에 새로운 객체 생성 
		
		System.out.println(name1 == name2); //주소가 같다.
		System.out.println(name1 == name3); //주소가 다르다. 
		
		System.out.println(name1.equals(name3));

//		String str = "자바공부합시다.";
//		System.out.println(str.length()); //8
//		
//		String str2 = null;
//		//System.out.println(str2.length()); //Null pointer Exception 
//		
//		System.out.println(str2);
	}

}
