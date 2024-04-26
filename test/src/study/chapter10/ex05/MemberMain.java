package study.chapter10.ex05;

public class MemberMain {

	public static void main(String[] args) {
		Member original = new Member(18, "홍길동", new int[] {10,20} , new Car("그랜저") ) ; // 배열 넘길 때 형식 주의!  
		
		Member cloned = original.getMember();

		cloned.scores[0] = 50;
		
		System.out.println("원본");
		System.out.println(original.age);
		System.out.println(original.name);
		for(int  i = 0; i < original.scores.length; i++) {
			System.out.println(original.scores[i]);
		}
		System.out.println(original.car.model);
		
	 
		original.name = "ddd";
		System.out.println(original.name);
		
		System.out.println();
		System.out.println("복제본");
		System.out.println(cloned.age);
		System.out.println(cloned.name);
		for(int  i = 0; i < cloned.scores.length; i++) {
			System.out.println(cloned.scores[i]);
		}
		System.out.println(cloned.car.model);
	}

}
