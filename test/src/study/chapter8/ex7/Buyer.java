package study.chapter8.ex7;

public class Buyer {
	int money = 1000;       // 보유 금액 
	int bonusPoint = 0;     // 현재 보너스 포인트 
	
	
	public void buy(Product p) {		
		if(money < p.getPrice()) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다. ");
			return ; // 메소드 종료	
		}
		
		else{
			if(p.getCoupon()) { // 쿠폰이 있으면 
				money -= (p.getPrice() - p.getCouponPrice());
				bonusPoint += ((p.getPrice() - p.getCouponPrice()) / 10); 
				System.out.println("쿠폰이 적용되었습니다.");
			} else {
				money -= p.getPrice();
				bonusPoint += p.getBonusPoint();
				System.out.println("쿠폰이 미적용 상품입니다.");
			}
		}		

		System.out.println(p.getProductName() + " 제품을 구매하셨습니다."); 
		System.out.println("제품 가격은 " + (p.getPrice() - p.getCouponPrice()) + "만원 입니다.");

		System.out.println("현재 잔액 " + money + "만원");
		System.out.println("현재 포인트 " + bonusPoint + "점");
		
		
	}
	
}
