package study.chapter8.ex2;

public class SmartTv implements Product{
	
	String productName = "삼성 스마트 TV";
	int price = 100;
	int bonusPoint;

	@Override
	public String getProductName() {
		return this.productName;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getBonusPoint() {
		bonusPoint = (int)(price / 10);
		return bonusPoint;
	}
	
	

}
