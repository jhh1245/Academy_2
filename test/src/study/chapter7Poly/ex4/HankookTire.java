package study.chapter7Poly.ex4;

public class HankookTire extends Tire{
	
	@Override
	public void roll() { // Tire의 roll() 메서드 재정의
		System.out.println("한국타이어를 달고 달립니다.");
	}
	
}
