package study.chapter08.ex7;

public class SmartTv implements Product{
	
	String productName = "삼성 스마트 TV";
	int price = 100;
	int bonusPoint;
	boolean coupon = false;
	int couponPrice;

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

	
	// 추가
	
	@Override
	public boolean getCoupon() {
		return coupon;
	}

	@Override
	public int getCouponPrice() {
		return couponPrice;
	}
	

}
