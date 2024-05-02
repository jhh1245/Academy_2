package study.chapter07Casting.ex9;

public class CastingMain {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		car = fe; // 자식타입이니까 대입 된다. 
		// car.water(); // 자식꺼니까 안된다. 부모는 자식것을 사용할 수 없다. 
		
		fe2 = (FireEngine)car; // Car car = new FireEngine() 했다가 -> 다시 FireEngine 타입으로 바꾼것 (강제형변환)  
		fe2.water(); // 그래서 자식에만 있는 메서드 접근 가능하다. 
		
	}
}
