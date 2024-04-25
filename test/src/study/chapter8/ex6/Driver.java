package study.chapter8.ex6;

public class Driver {
	public void drive(Vehicle vehicle) { // Vehicle이거나 Vehicle 구현한 Bus, Taxi가 올 수 있다.
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle; // Vehicle vehicle = new Bus() 했은니까 강제형변환 할 수 있다.
			bus.checkPrice();
			
			// bus.run(); //bus, taxi run 메소드 쓴다.
		} else {
			System.out.println("Bus 타입이 아닙니다."); 
		}
		
		vehicle.run(); // 택시, 버스에 따라서 run 메소드 실행 가능 
		
	}
}
