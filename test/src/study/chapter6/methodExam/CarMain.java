package study.chapter6.methodExam;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();

		car1.isLeftGas();
		car1.setGas(10);
		car1.isLeftGas();
		boolean gasState = car1.isLeftGas();
		System.out.println(gasState);
		
//		if(gasState) { // 연료가 있으면
//			System.out.println("차가 출발합니다.");
//			car1.run();
//		}
		
		if(car1.isLeftGas()) {
			System.out.println("gas를 충전할 필요가 없습니다. 현재 가스 잔량 : " + car1.gas);
		} else {
			System.out.println("gas가 없습니다. gas를 충전하세요.");
		}
	}

}
