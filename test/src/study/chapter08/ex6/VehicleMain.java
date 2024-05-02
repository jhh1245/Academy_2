package study.chapter08.ex6;

public class VehicleMain {
	public static void main(String[] args) {
//		Driver d = new Driver();
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
//		
//		d.drive(bus);
//		d.drive(taxi);
		
//		d.drive(new Taxi());
//		d.drive(new Bus());
		
		
		// 강제형변환 1
		
//		Vehicle vehicle = new Bus();
//		vehicle.run();
//		
//		// Bus bus = vehicle; // 자동타입변환이 안되니까
//		Bus bus = (Bus)vehicle; // 강제형변환 해야 한다.
//		bus.run();
//		bus.checkPrice(); // 강제로 형변환했으니까 Vehicle에는 없는 메소드를 부를 수 있다. 
		
		//Taxi taxi = (Taxi)vehicle; // 예외 발생  java.lang.ClassCastException -> 프로그램 종료 
		
		
		// 강제형변환 2
		Driver drive = new Driver();
		Bus bus = new Bus();
		
		Taxi taxi = new Taxi();
		
		Vehicle vehicle = new Bus(); // Vehicle 타입이니까 checkPrice는 불가함 
		drive.drive(vehicle); // drive 메서드 안에서 Bus bus = (Bus)vehicle;일어나서 강제 형변환 -> checkPrice 된다. 

		
		
		vehicle = new Taxi(); // Vehicle 타입이니까 checkPrice는 불가함 
		drive.drive(vehicle);
		
		boolean result1 = bus instanceof Vehicle;
		System.out.println(result1);
		
		boolean result2 = bus instanceof Vehicle;
		System.out.println(result2);
		
		boolean result3 = vehicle instanceof Bus;
		System.out.println(result3);
		
		boolean result4 = vehicle instanceof Taxi;
		System.out.println(result4);
	}
}
