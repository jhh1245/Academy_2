package study.chapter07Overriding.ex5;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer com = new Computer(); // 자식 
		Calculator cal = new Calculator();
		
		int r = 10;
		System.out.println("원 면적 1 : " + com.areaCircle(r));
		System.out.println("원 면적 2 : " + cal.areaCircle(r));

	}

}
