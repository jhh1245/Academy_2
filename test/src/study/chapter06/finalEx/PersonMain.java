package study.chapter06.finalEx;

public class PersonMain {
	public static void main(String[] args) {
		// Person p1 = new Person();
		// 기본생성자 x 으니 에러
		
		Person p1 = new Person("홍길동", "123456-654321");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";			// final 필드임으로 값 변경 불가 
		// p1.ssn = "654321-123456";
		p1.name = "김자바 ";
		
		Person p2 = new Person("홍길순", "123456-654321");
		System.out.println(p2.name);
	}
}
