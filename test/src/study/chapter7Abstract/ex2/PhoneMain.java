package study.chapter7Abstract.ex2;

public class PhoneMain {

	public static void main(String[] args) {
		// Phone phone = new Phone();
		// 추상 클래스여서 못 만든다. 
		
		SmartPhone sp = new SmartPhone("길동이");
		
		sp.turnOn();
		sp.turnOff();
		sp.internetSearch();
		
		System.out.println();
		
		Phone phone = sp; // 자동형변환 
		phone.turnOn();
		phone.turnOff();
		//phone은 internetSearch는 못한다.
	}
}
