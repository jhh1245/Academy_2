package study.chapter7.ex9;

public class SuperAirplane extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPER_FLY = 2;
	
	public int flyMode = SUPER_FLY; 
	
	@Override
	public void fly() {
		if(flyMode == SUPER_FLY) {
			System.out.println("초음속 모드로 변경합니다.");
			System.out.println("초음속으로 비행합니다.");
		}
		else {
			super.fly(); // 부모 메서드
		}
		
	}

}
