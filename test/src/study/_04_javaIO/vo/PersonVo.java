package study._04_javaIO.vo;

import java.io.Serializable;

// PersonVO가 직렬화 가능한 객체로 표현 : Serializable 
public class PersonVo implements Serializable { // 시리얼라이즈가 가능한 객체이다. 
	
	String name;
	int age;
	String addr;
	
	public PersonVo() {
		// TODO Auto-generated constructor stub
	}
	public PersonVo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return String.format("[%s-%d-%s]", name, age, addr);
	}
	
	// alt + shift + s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
