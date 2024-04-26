package study.chapter10.ex01;

import java.util.Date;

public class MemberMain {

	public static void main(String[] args) {
		Member mem1 = new Member("blue"); //여기서 id를 초기화했고 생성자를 이용해
		Member mem2 = new Member("blue");
		Member mem3 = new Member("green");

		if(mem1.equals(mem2)) { // 같은 객체 mem2의 id랑 자신 mem1의 id (위에 초기화한)것을 비교 
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		if(mem1.equals(mem3)) { // Object는 주소값을 비교 (같은 객체인지) String 은 값을 비교! 다르다! 
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		if(mem2.equals(mem3)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		System.out.println(mem1); // toString이 생략되어 있다 
		System.out.println(mem1.toString());
		
		String str = new String("자바");
		System.out.println(str); //String은 많이쓰니까 객체가 가지고있는 값을 가져오라고 toString()를 재정의 했다.
		
		Date day = new Date();
		String result = day.toString();
		System.out.println(result);
	}

}
