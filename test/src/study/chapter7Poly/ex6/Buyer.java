package study.chapter7Poly.ex6;

public class Buyer { //구매자
	int money = 1000;       // 보유 금액 
	int bonusPoint = 0;     // 현재 보너스 포인트 
	
	void buy(Product p) {		
		if(money < p.price) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다. ");
			return ; // 메소드 종료 
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		// 여기서 p.으로 잘 가져오는 이유는 자식을 만들 때 부모 생성자 호출시 가격을 매개변수로 줘서, 부모의 필드에 값이 저장되었기 때문이다. 
		// 
		
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
