package study.chapter8.ex2;

public class Computer implements Product{
	String productName = "조립 PC";
	int price = 300;
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
		this.bonusPoint = (int)(price / 10);
		return this.bonusPoint;
	}
}
