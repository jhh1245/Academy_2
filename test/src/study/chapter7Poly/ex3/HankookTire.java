package study.chapter7Poly.ex3;

public class HankookTire extends Tire{
	
	@Override
	public void roll() { // Tire의 roll() 메서드 재정의
		System.out.println("빗길에 강한 한국 타이어");
		System.out.println("한국타이어를 달고 바퀴가 굴러갑니다.");
	}
	
}
