package study.chapter07Poly.ex7;

public class SmartTv extends Product{
	String productName = "삼성 스마트 TV";
	int price = 100;
	int bonusPoint;
	
//	SmartTv(){ // SmartTv(100) 이렇게 안하는 이유는 그냥 가격을 고정시키려고 
//		super(100);
//	}
	// 이렇게만하면 상품명은 초기화 되지 않는다.
	
	@Override
	public String getProductName() { // 상품명 리턴 
		return this.productName;
	}
	// 그래서 이렇게 getProductName 메서드 오버라이딩해서 이름을 초기화 
	
	
	@Override
	public int getBonusPoint() {
		bonusPoint = (int)(price / 10);
		return bonusPoint;
	}
	
	@Override
	public int getPrice() {			// 상품 가격을 이턴 
		return this.price;
	}
	// 가지고 있는 돈 차감할때 이 메서드 필요 
	// 보모꺼를 오버라이딩한 이유는 자식에서 직접 가격을 정했기 때문에 (ex6예제에서는 부모 생성자를 이용해서 가격 초기화 했었음) 
}
