package study.chapter10.ex02;

import java.util.Date;

public class SmartPhone {
//	@Override
//	public String toString() {  // 내가 만든 클래스도 toString을 오버라이딩 할 수 있다. 
//		Date day = new Date();
//		String result = day.toString();
//		return result;
//	}
	
	String company;
	String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {  // 내가 만든 클래스도 toString을 오버라이딩 할 수 있다. 
		
		return company + ", " + os;
	}
}
