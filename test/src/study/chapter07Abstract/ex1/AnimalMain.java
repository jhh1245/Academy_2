package study.chapter07Abstract.ex1;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog("해피", 4);
		
		Cat cat = new Cat("냥냥", 3);
		 
		dog.type = "개";
		cat.type = "고양이";
		
		dog.move();
		dog.eat();
		dog.animalType();
		dog.bark(); // 오버라이딩한 메소드  
		System.out.println();
		
		
		cat.move();
		cat.eat();
		cat.animalType();
		cat.bark(); // 오버라이딩한 메소드
		System.out.println();
		
		Animal animal = dog;
		animal.bark();
	}

}
