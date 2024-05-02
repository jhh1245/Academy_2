package study.chapter07Poly.ex7;

public class Buyer { //구매자
	public int money = 1000;       // 보유 금액 
	public int bonusPoint = 0;     // 현재 보너스 포인트 
	
	public void buy(Product p) {		
		if(money < p.price) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다. ");
			return ; // 메소드 종료 
		}
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint(); 
		// @@ 여기도 그냥 p.price, p.bonus를 쓰면 안됨 
		// 왜냐면 Product p = new Computer();로 했으니까 p.을 하게되면 부모 price, bonus를 가져옴 
		// 그래서 자식에서 오버라이딩한 get 메소드를 사용해야 자식의 price, bonus를 가져온다. 
		
		System.out.println(p.getProductName() + " 제품을 구매하셨습니다."); 
		// @@ 여기에 p.productName했을 때 null이 나온이유
		// Product p = new Computer();로 했으니까
		// p는 자식의 오버라이딩한 메소드에만 접근할 수 있다. productName도 부모꺼를 가져온다. 
		// 그래서 get메소드를 통해서 자식 name에 접근한 것!!  
		
		// computer랑 tv에 productName이 있으니까 그 값을 가져옴
		
		
		System.out.println("제품 가격은 " +  p.getPrice() + "원 입니다.");
		// 여기에 p.price를 직접 접근하면 안되니까 (맘대로 가격을 바꾸게 하면 안되니 접근 금지 private해야함)
		// get, set을 써야한다. 
		
	}

}
