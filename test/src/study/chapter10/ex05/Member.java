package study.chapter10.ex05;

import java.util.Arrays;

public class Member implements Cloneable { 
	// 필드 
	public int age;
	public String name;
	public int [] scores; // 참조타입 배열 
	public  Car car; 	  // 참조타입 Car 필드 
	
	// 생성자
	public Member(int age, String name, int[] scores, Car car) {
		this.age = age;
		this.name = name;
		this.scores = scores;
		this.car = car;
	}
	
	// 메서드
	@Override
	protected Object clone() throws CloneNotSupportedException { // Object 객체의 clone이 아니라 이게 호출된다? 
		//Object의 clone으로 얕은복제
		Member cloned = (Member)super.clone();   // 여기는 Object의 clone. 여기서 참조형이 아닌 타입들은 값 복제
		
		// 참조형인 타입들은 아래에서 깊은 복사 
		//깊은 복제 
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); //this.scores를 끝까지 복사
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null; 
		try {
			cloned = (Member)clone(); // 위 코드. 재정의한 clone()를 부른다. 
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		return cloned;
	}
}
