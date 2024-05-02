package study.chapter07Poly.ex7;

public class Main {

	public static void main(String[] args) {
		Buyer buy1 = new Buyer();
		// 보유 금액이 사람마다 다르게 하려면 Buyer에 보유금액을 세팅할 수 있도록 생성자 만들면 된다.
		
		buy1.buy(new SmartTv()); //여기에 바로 new를 사용할 수 있다.
		System.out.println();
		buy1.buy(new Computer());
		System.out.println();
		buy1.buy(new Radio());
		System.out.println();
		buy1.buy(new Refrigerator());
		System.out.println();
		buy1.buy(new Refrigerator());
		System.out.println();
		
		buy1.buy(new Refrigerator());
		System.out.println();
		
		
		System.out.println("현재 잔액 : " + buy1.money);
		System.out.println("현재 포인트 : " + buy1.bonusPoint);
		
	}

}
