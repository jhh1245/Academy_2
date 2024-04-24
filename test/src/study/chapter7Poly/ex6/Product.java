package study.chapter7Poly.ex6;

public class Product {
	int price; 			// 가격 
	String productName; // 제품명
	int bonusPoint;		// 보너스 포인트  
	
	// 생성자 
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price / 10); // 소수점으로 나오지 못하게 
	}
	
	public String getProductName() { // 상품명 리턴 
		return productName;
	}
	
	public int getPrice() {			// 상품 가격을 이턴 
		return price;
	}
	
	
}
