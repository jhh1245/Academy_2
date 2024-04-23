package study.chapter7.ex1;

public class Dog extends Animal {
	String dogBark;
	
	void dogBark() {
		System.out.println("강아지가 짖습니다.");
	}
	
	
	void dogBark(String dogBark) {
		this.dogBark = dogBark;
		System.out.println("강아지가 " + this.dogBark + "하고 짖습니다.");
	}
	
	void dogRun() {
		System.out.println("강아지가 뜁니다.");
	}
}
