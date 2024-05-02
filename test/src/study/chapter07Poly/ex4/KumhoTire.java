package study.chapter07Poly.ex4;

public class KumhoTire extends Tire{
	
	@Override
	public void roll() { // Tire의 roll() 메서드 재정의
		System.out.println("금호타이어를 달고 달립니다.");
	}
}
