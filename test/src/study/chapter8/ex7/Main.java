package study.chapter8.ex7;

public class Main {

	public static void main(String[] args) {
		Buyer buy1 = new Buyer();
		
		buy1.buy(new Computer());
		System.out.println();
		
		
		
		buy1.buy(new SmartTv());
		System.out.println();
	}

}
