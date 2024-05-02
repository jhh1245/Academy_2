package study.chapter08.ex2;

public class Main {

	public static void main(String[] args) {
		Buyer buy1 = new Buyer();
		
		buy1.buy(new SmartTv()); //여기에 바로 new를 사용할 수 있다.
		System.out.println();
		
		System.out.println("현재 잔액 : " + buy1.money);
		System.out.println("현재 포인트 : " + buy1.bonusPoint);
	}

}
