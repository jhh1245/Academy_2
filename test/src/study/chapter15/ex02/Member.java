package study.chapter15.ex02;

public class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age; //name의 해시코드(메모리 번지)와 나이를 더해서 리턴 
		
	}

	@Override
	public boolean equals(Object obj) { 
		if(obj instanceof Member) {
			Member member = (Member)obj;
			boolean result = (member.name.equals(name)) && (member.age == age);
			// member의 name과 age가 같으면!! 같은객체이다!! 
		}
		return super.equals(obj);
	}
	
}
