package study.chapter07Abstract.ex1;

public abstract class Animal { // 추상 메소드를 만들면 추상 클래스여야 한다. 
	String name;
	int age;
	String type;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void move() { // 재정의 필수 아님 
		System.out.println(type + "이(가) 네 발로 이동합니다. ");
	}
	
	public void eat() {
		System.out.println(type + "이(가) 사료를 먹습니다.");
	}
	
	public void animalType() {
		System.out.println(type + "과 동물입니다.");
	}
	
	public abstract void bark(); // 추상 메소드 

}
