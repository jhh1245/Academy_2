package study.chapter7.ex1;

public class Animal { // 부모클래스 
	String animalBark;
	
	void animalBark() {
		System.out.println("동물들이 짖습니다.");
	}
	
	void animalBark(String animalBark) {
		this.animalBark = animalBark;
		System.out.println("동물들이 " + this.animalBark + "하고 짖습니다");
	}
	
	void animalRun() {
		System.out.println("동물들이 뜁니다.");
	}
}
