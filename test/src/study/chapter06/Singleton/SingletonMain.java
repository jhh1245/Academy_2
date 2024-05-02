package study.chapter06.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// Singleton sgt = new Singleton(); // 생성자 private라면 new 사용한 객체 생성 불가 
		
		Singleton sgt1 = Singleton.getInstance();
		Singleton sgt2 = Singleton.getInstance();
		
		//sgt1,2는 같은 객체이다. 
	
		if(sgt1 == sgt2) {
			System.out.println("같은 객체");
		}
		
		if(sgt1.equals(sgt2)) {
			System.out.println("같은 객체입니다.");
		}
		
		System.out.println(sgt1); // 메모리 주소값이 동일 
		System.out.println(sgt2);
		
	}

}
