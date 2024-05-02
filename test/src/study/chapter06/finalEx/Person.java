package study.chapter06.finalEx;

public class Person {
	final String nation = "Korean";
	final String ssn; // 컴파일 에러. 초기값이 없어서 
	String name;
	
	public Person(String name, String ssn) { // 하지만 생성자를 만들어주면 에러는 사라진다. 
		this.ssn = ssn;
		this.name = name;
	}
	
	static final double PI = 3.141592;
}
