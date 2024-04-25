package study.chapter8.ex7;

public class Computer implements Product{
	String productName = "조립 PC";
	int price = 300;
	int bonusPoint;
	boolean coupon = true;
	int couponPrice = 50;

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
		this.bonusPoint = (int)(price / 10);
		return this.bonusPoint;
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
