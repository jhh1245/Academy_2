package study.chapter10.ex04;

public class Member implements Cloneable { 
	// 복제를 허용 할거냐 말거냐, Cloneable 구현한 클래스만 clone() 메서드로 복제가능
	//  implements Cloneable 했을 때 에러나지 않는 이유는 추상메서드가 없기 때문에
	
	// 필드 
	public int age;
	public String id; 
	public String password;
	public boolean adult; 
	int [] scores; // 참조타입이라 얕은 복사는 주소값공유, 그래서 main에서 배열값을 변경했을 때 복제된 객체의 배열값도 변경된다. 
	
	// 생성자
	public Member(String id, String password, int age, boolean adult, int[] scores) {
		this.id = id;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.scores = scores;
		
	}
	
	// 메서드
	public Member getMember() {
		Member cloned = null; // 여기에 선언한 이유는 try문 뒤에 return 하기 위해서 
		try {
			cloned = (Member)clone(); //객체르 복사해서 넣겠다. 
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		return cloned;
	}
	
	
}
