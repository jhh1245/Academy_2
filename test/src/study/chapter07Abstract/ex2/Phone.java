package study.chapter07Abstract.ex2;

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
//	public void turnOn() { 
//		// smart phone에서 재정의 하는건 선택이나, 여기가 abstract로 바뀌면 재 정의는 필수가 된다. 
//		System.out.println("폰 전원 켭니다.");
//	}
//	
//	public void turnOff() {
//		System.out.println("폰 전원 끕니다.");
//	}
	
	
	public abstract void turnOn();
	
	public abstract void turnOff();
}


