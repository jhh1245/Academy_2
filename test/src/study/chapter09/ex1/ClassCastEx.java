package study.chapter09.ex1;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCastEx {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animal = dog; // 자동타입변환 
		changeDog(animal);
		
		//animal = cat;
		//changeDog(animal);
		
		System.out.println(10/0);
		
	}
	
	public static void changeDog(Animal animal) {
		Dog dog = (Dog)animal;
		System.out.println("캐스팅되었습니다.");
	}

}
