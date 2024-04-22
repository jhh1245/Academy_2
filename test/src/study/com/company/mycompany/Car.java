package study.com.company.mycompany;

import study.com.company.hankook.SnowTire; // 이렇게 많이 사용 
import study.com.company.hankook.Tire; 
import study.com.company.kumho.RainTire; 

public class Car {

	public static void main(String[] args) {
		// study.com.company.hankook.SnowTire st = new study.com.company.hankook.SnowTire();
		// 잘 사용하지 않는 방식 
		
		 SnowTire tire1 = new SnowTire();
		 RainTire tire2 = new RainTire();
		
		 Tire tire3 = new Tire(); // 이건 문제없지만 
		 study.com.company.kumho.Tire tire4 = new study.com.company.kumho.Tire();
		 // 이름이 동일한 클래스가 또 있을 경우 패키지명 까지 써줘야한다.
		 // 그래서 클래스명은 겹치지 않아야함 
		 
		 
		
	}
}
