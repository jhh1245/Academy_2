package study.chapter07Abstract.ex2;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색합니다.");
	}
	
	
	@Override
	public void turnOn() {  
		System.out.println("스마트폰 전원 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("스마트폰 전원 끕니다.");
	}
}
