package study.chapter7Poly.ex3;

public class KumhoTire extends Tire{
	
	@Override
	public void roll() { // Tire의 roll() 메서드 재정의
		System.out.println("눈길에 강한 금호 타이어");
		System.out.println("금호타이어를 달고 바퀴가 굴러갑니다.");
	}
}
