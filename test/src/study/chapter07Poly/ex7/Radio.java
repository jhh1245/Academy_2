package study.chapter07Poly.ex7;

public class Radio extends Product{
	String productName = "라디오";
	int price = 50;
	int bonusPoint;
	
//	Computer(){ // SmartTv(100) 이렇게 안하는 이유는 그냥 가격을 고정시키려고 
//		super(300);
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
}
