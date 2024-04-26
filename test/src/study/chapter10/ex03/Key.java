package study.chapter10.ex03;

public class Key {
	
	int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	
	@Override
	public int hashCode() { 
		// 원래는 메모리 주소 비교인데 Key의 number 필드로 비교를 했다.
		// hashmap put과 get할때 이 메소드를 부른다. 
		
		
		System.out.println("hashCode() 호출");
		return this.number;
	}
	
	@Override
	public boolean equals(Object obj) { // equals를 재정의 
		System.out.println("equals() 호출");
		// 이게 떴다는 것은 hashCode()리턴값이 같다는 의미 
		  
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number == compareKey.number) { 
				// 현재 number와 외부에서 받은 obj의 number 값을 비교 
				// Key(1), Key(1)은 number가 같으니까 
				System.out.println("같아요");
				return true;
			}
		}
		return false;
		// Key 타입이 아니면 바로 false. 다른객체이다.
	}


}
