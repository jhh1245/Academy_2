package study.chapter7.ex1;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.dogRun();
		dog.dogBark();
		dog.dogBark("멍멍                                                                                                                                                                                                     ");

		
		dog.animalBark(); // 부모 메서드 상속 받아서 사용할 수 있다 
		dog.animalBark("월월"); // 부모 메서드 상속 받아서 사용할 수 있다 
		dog.animalRun();
	}

}
